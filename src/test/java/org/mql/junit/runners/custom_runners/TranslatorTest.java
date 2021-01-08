package org.mql.junit.runners.custom_runners;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mql.junit.Translator;

import static org.junit.Assert.assertEquals;

@RunWith(PropTestRunner.class)
public class TranslatorTest {

    @Test
    @PropTestRunner.SystemProperty(name = "lang", value = "fr")
    public void translateHelloToFrench() {
        System.out.println(">> translateHelloToFrench");
        String result = new Translator("fr").translate("hello");
        assertEquals("salut", result);
    }

    @Test
    @PropTestRunner.SystemProperty(name = "lang", value = "fr")
    public void translateMorningToFrench() {
        System.out.println(">> translateMorningToFrench");
        String result = new Translator("fr").translate("morning");
        assertEquals("matin", result);
    }

    @Test
    @PropTestRunner.SystemProperty(name = "lang", value = "fr")
    public void translateNightToFrench() {
        System.out.println(">> translateNightToFrench");
        String result = new Translator("fr").translate("night");
        assertEquals("nuit", result);
    }

    @Test
    @PropTestRunner.SystemProperty(name = "lang", value = "es")
    public void translateHelloToSpanish() {
        System.out.println(">> translateHelloToSpanish");
        String result = new Translator("es").translate("hello");
        assertEquals("hola", result);
    }

    @Test
    @PropTestRunner.SystemProperty(name = "lang", value = "es")
    public void translateMorningToSpanish() {
        System.out.println(">> translateMorningToSpanish");
        String result = new Translator("es").translate("morning");
        assertEquals("mañana", result);
    }

    @Test
    @PropTestRunner.SystemProperty(name = "lang", value = "es")
    public void translateNightToSpanish() {
        System.out.println(">> translateNightToSpanish");
        String result = new Translator("es").translate("night");
        assertEquals("noche", result);
    }

}
