package br.com.caelum.empresa.leitor;

import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Scanner;

import br.com.caelum.empresa.modelo.Funcionario;
import br.com.caelum.empresa.modelo.Gasto;

public class ImportadorDeGastos {
	
	private SimpleDateFormat dataformatada = new SimpleDateFormat("ddMMyyyy");
	
	public Collection<Gasto> importa(InputStream entrada) throws ParseException {
		
		@SuppressWarnings("resource")
		Scanner leitor = new Scanner(entrada);
		
		Collection<Gasto> gastos = new LinkedHashSet<Gasto>();
		
		while (leitor.hasNextLine()) {
			String line = leitor.nextLine();
			String txtTipo = line.substring(0, 6);
			String txtData = line.substring(6, 14);
			String txtValor = line.substring(14, 23);
			String txtMatricula = line.substring(23, 26);
			String txtNome = line.substring(26, 56);
			String txtDataDeNascimento = line.substring(56);

			double valor = Double.parseDouble(txtValor);

			int matricula = Integer.parseInt(txtMatricula);

			Calendar dataNascimento = converteDataTxtParaDataFormatada(txtDataDeNascimento);

			Calendar dataDespesa = converteDataTxtParaDataFormatada(txtData);

			Funcionario funcionario = new Funcionario(txtNome, matricula, dataNascimento);
			gastos.add(new Gasto(valor, txtTipo, funcionario, dataDespesa, true));
		}
		
		return gastos;
	}

	private Calendar converteDataTxtParaDataFormatada(String txtQualquerData) throws ParseException {
		Calendar data = Calendar.getInstance();
		data.setTime(dataformatada.parse(txtQualquerData));
		return data;
	}
}
