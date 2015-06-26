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
@Component("photo")
public class Photo extends Operation {

    @Override
    public String printFormat(String type) {
        return "Sto stampando un Foto in formato "+ type;
    }
}