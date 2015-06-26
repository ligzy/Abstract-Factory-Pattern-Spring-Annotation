/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cavallefano.abstractfactoryspringannotation.concrete;

import it.cavallefano.abstractfactoryspringannotation.factory.Operation;
import org.springframework.stereotype.Component;

/**
 *
 * @author s.cavallotto
 */
@Component("letter")
public class Letter extends Operation {

    @Override
    public String printFormat(String type) {
        return "Sto stampando una Lettera in formato "+ type;
    }
}