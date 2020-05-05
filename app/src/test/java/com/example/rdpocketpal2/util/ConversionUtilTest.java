package com.example.rdpocketpal2.util;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConversionUtilTest {
    // general values
    private static final double DELTA_SIX = 0.000001;
    private static final double DELTA_EIGHT = 0.00000001;
    private static final double TEN_GRAMS = 10;
    private static final double TEN_THOUSAND_MILLIGRAMS = 10000;

    // pounds to kilograms values
    private static final double LB_TO_KG_INPUT = 100;
    private static final double LB_TO_KG_ANSWER = 45.359237;

    // inches to centimeters values
    private static final double IN_TO_CM_INPUT = 100;
    private static final double IN_TO_CM_ANSWER = 254;

    // fahrenheit to celsius values
    private static final double FAHRENHEIT_TO_CELSIUS_INPUT = 212;
    private static final double FAHRENHEIT_TO_CELSIUS_ANSWER = 100;

    // gallons to liters values
    private static final double GALLONS_TO_LITERS_INPUT = 100;
    private static final double GALLONS_TO_LITERS_ANSWER = 378.541;

    // grams to milliequivalents values
    private static final double GM_TO_MEQ_CALCIUM = 499.0268975498;
    private static final double GM_TO_MEQ_CHLORINE = 282.0874471086;
    private static final double GM_TO_MEQ_MAGNESIUM = 822.8759514503;
    private static final double GM_TO_MEQ_PHOSPHORUS = 968.5542713243;
    private static final double GM_TO_MEQ_POTASSIUM = 255.7675584429;
    private static final double GM_TO_MEQ_SODIUM = 434.9717268378;

    @Test
    public void poundsToKilograms_isCorrect() {
        assertEquals(LB_TO_KG_ANSWER
                , ConversionUtil.poundsToKilograms(LB_TO_KG_INPUT)
                , DELTA_SIX
        );
    }

    @Test
    public void inchesToCentimeters_isCorrect() {
        assertEquals(IN_TO_CM_ANSWER
                , ConversionUtil.inchesToCentimeters(IN_TO_CM_INPUT)
                , DELTA_SIX
        );
    }

    @Test
    public void fahrenheitToCelsius_isCorrect() {
        assertEquals(FAHRENHEIT_TO_CELSIUS_ANSWER
                , ConversionUtil.fahrenheitToCelsius(FAHRENHEIT_TO_CELSIUS_INPUT)
                , DELTA_SIX
        );
    }

    @Test
    public void gallonsToLiters_isCorrect() {
        assertEquals(GALLONS_TO_LITERS_ANSWER
                , ConversionUtil.gallonsToLiters(GALLONS_TO_LITERS_INPUT)
                , DELTA_SIX
        );
    }

    @Test
    public void gramsToMilliequivalents_isCorrect() {
        // calcium
        assertEquals(GM_TO_MEQ_CALCIUM
                , ConversionUtil.gramsToMilliequivalents(Constants.CALCIUM, TEN_GRAMS)
                , DELTA_EIGHT
        );

        // chlorine
        assertEquals(GM_TO_MEQ_CHLORINE
                , ConversionUtil.gramsToMilliequivalents(Constants.CHLORINE, TEN_GRAMS)
                , DELTA_EIGHT
        );

        // magnesium
        assertEquals(GM_TO_MEQ_MAGNESIUM
                , ConversionUtil.gramsToMilliequivalents(Constants.MAGNESIUM, TEN_GRAMS)
                , DELTA_EIGHT
        );

        // phosphorus
        assertEquals(GM_TO_MEQ_PHOSPHORUS
                , ConversionUtil.gramsToMilliequivalents(Constants.PHOSPHORUS, TEN_GRAMS)
                , DELTA_EIGHT
        );

        // potassium
        assertEquals(GM_TO_MEQ_POTASSIUM
                , ConversionUtil.gramsToMilliequivalents(Constants.POTASSIUM, TEN_GRAMS)
                , DELTA_EIGHT
        );

        // sodium
        assertEquals(GM_TO_MEQ_SODIUM
                , ConversionUtil.gramsToMilliequivalents(Constants.SODIUM, TEN_GRAMS)
                , DELTA_EIGHT
        );
    }

    @Test
    public void milliequivalentsToGrams_isCorrect() {
        // calcium
        assertEquals(TEN_GRAMS
                , ConversionUtil.milliequivalentsToGrams(Constants.CALCIUM, GM_TO_MEQ_CALCIUM)
                , DELTA_EIGHT
        );

        // chlorine
        assertEquals(TEN_GRAMS
                , ConversionUtil.milliequivalentsToGrams(Constants.CHLORINE, GM_TO_MEQ_CHLORINE)
                , DELTA_EIGHT
        );

        // magnesium
        assertEquals(TEN_GRAMS
                , ConversionUtil.milliequivalentsToGrams(Constants.MAGNESIUM, GM_TO_MEQ_MAGNESIUM)
                , DELTA_EIGHT
        );

        // phosphorus
        assertEquals(TEN_GRAMS
                , ConversionUtil.milliequivalentsToGrams(Constants.PHOSPHORUS, GM_TO_MEQ_PHOSPHORUS)
                , DELTA_EIGHT
        );

        // potassium
        assertEquals(TEN_GRAMS
                , ConversionUtil.milliequivalentsToGrams(Constants.POTASSIUM, GM_TO_MEQ_POTASSIUM)
                , DELTA_EIGHT
        );

        // sodium
        assertEquals(TEN_GRAMS
                , ConversionUtil.milliequivalentsToGrams(Constants.SODIUM, GM_TO_MEQ_SODIUM)
                , DELTA_EIGHT
        );
    }

    @Test
    public void milligramsToMilliequivalents_isCorrect() {
        // calcium
        assertEquals(GM_TO_MEQ_CALCIUM
                , ConversionUtil.milligramsToMilliequivalents(Constants.CALCIUM, TEN_THOUSAND_MILLIGRAMS)
                , DELTA_EIGHT
        );

        // chlorine
        assertEquals(GM_TO_MEQ_CHLORINE
                , ConversionUtil.milligramsToMilliequivalents(Constants.CHLORINE, TEN_THOUSAND_MILLIGRAMS)
                , DELTA_EIGHT
        );

        // magnesium
        assertEquals(GM_TO_MEQ_MAGNESIUM
                , ConversionUtil.milligramsToMilliequivalents(Constants.MAGNESIUM, TEN_THOUSAND_MILLIGRAMS)
                , DELTA_EIGHT
        );

        // phosphorus
        assertEquals(GM_TO_MEQ_PHOSPHORUS
                , ConversionUtil.milligramsToMilliequivalents(Constants.PHOSPHORUS, TEN_THOUSAND_MILLIGRAMS)
                , DELTA_EIGHT
        );

        // potassium
        assertEquals(GM_TO_MEQ_POTASSIUM
                , ConversionUtil.milligramsToMilliequivalents(Constants.POTASSIUM, TEN_THOUSAND_MILLIGRAMS)
                , DELTA_EIGHT
        );

        // sodium
        assertEquals(GM_TO_MEQ_SODIUM
                , ConversionUtil.milligramsToMilliequivalents(Constants.SODIUM, TEN_THOUSAND_MILLIGRAMS)
                , DELTA_EIGHT
        );
    }

    @Test
    public void milliequivalentsToMilligrams_isCorrect() {
        // calcium
        assertEquals(TEN_THOUSAND_MILLIGRAMS
                , ConversionUtil.milliequivalentsToMilligrams(Constants.CALCIUM, GM_TO_MEQ_CALCIUM)
                , DELTA_EIGHT
        );

        // chlorine
        assertEquals(TEN_THOUSAND_MILLIGRAMS
                , ConversionUtil.milliequivalentsToMilligrams(Constants.CHLORINE, GM_TO_MEQ_CHLORINE)
                , DELTA_EIGHT
        );

        // magnesium
        assertEquals(TEN_THOUSAND_MILLIGRAMS
                , ConversionUtil.milliequivalentsToMilligrams(Constants.MAGNESIUM, GM_TO_MEQ_MAGNESIUM)
                , DELTA_EIGHT
        );

        // phosphorus
        assertEquals(TEN_THOUSAND_MILLIGRAMS
                , ConversionUtil.milliequivalentsToMilligrams(Constants.PHOSPHORUS, GM_TO_MEQ_PHOSPHORUS)
                , DELTA_EIGHT
        );

        // potassium
        assertEquals(TEN_THOUSAND_MILLIGRAMS
                , ConversionUtil.milliequivalentsToMilligrams(Constants.POTASSIUM, GM_TO_MEQ_POTASSIUM)
                , DELTA_EIGHT
        );

        // sodium
        assertEquals(TEN_THOUSAND_MILLIGRAMS
                , ConversionUtil.milliequivalentsToMilligrams(Constants.SODIUM, GM_TO_MEQ_SODIUM)
                , DELTA_EIGHT
        );
    }
}
