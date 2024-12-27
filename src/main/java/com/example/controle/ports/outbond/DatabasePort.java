package com.example.controle.ports.outbond;

import com.example.controle.domain.model.Transaction;

public interface DatabasePort {

    public void saveTransaction(final Transaction transaction);

}
