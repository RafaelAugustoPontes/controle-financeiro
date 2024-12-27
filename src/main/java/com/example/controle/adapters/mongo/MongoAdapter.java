package com.example.controle.adapters.mongo;

import com.example.controle.domain.model.Transaction;
import com.example.controle.ports.outbond.DatabasePort;

public class MongoAdapter implements DatabasePort{

    @Override
    public void saveTransaction(Transaction transaction) {
        //TODO criar conexão com o banco de dados
        System.out.println("Transaction saved");
    }


}
