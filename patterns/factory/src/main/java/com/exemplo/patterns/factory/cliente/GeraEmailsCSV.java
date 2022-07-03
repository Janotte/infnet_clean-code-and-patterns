package com.exemplo.patterns.factory.cliente;

import com.exemplo.patterns.factory.biblioteca.comunicacao.GeraEmail;
import com.exemplo.patterns.factory.cliente.csv.EmailCSV;

import javax.swing.*;

public class GeraEmailsCSV {

    public static void main(String[] args) {

        GeraEmail geraEmail = new EmailCSV("contatos.csv");
        String corpoEmail = JOptionPane.showInputDialog(null, "Informe a mensagem:");
        boolean status = geraEmail.enviarEmail(corpoEmail);

        if (status) {
            JOptionPane.showMessageDialog(null,"E-mails enviados!");
        } else {
            JOptionPane.showMessageDialog(null,"Erro ao enviar E-mails!");
        }
    }
}
