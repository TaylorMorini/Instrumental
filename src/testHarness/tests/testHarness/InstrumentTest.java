package testHarness;

import Model.Instrument;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class InstrumentTest extends Instrument {

    @Test
    void getTestInstrumentName() {
        Instrument inst = new Instrument();
        setInstrumentName("Epiphone");

        Assertions.assertEquals("Epiphone", getInstrumentName());
    }

    @Test
    void setTestInstrumentName() {
        Instrument inst = new Instrument();
        setInstrumentName("Epiphone");

        Assertions.assertEquals("Epiphone", getInstrumentName());
    }

    @Test
    void getTestInstrumentBrand() {
        Instrument inst = new Instrument();
        setInstrumentBrand("Gibson");

        Assertions.assertEquals("Gibson", getInstrumentBrand());
    }

    @Test
    void setTestInstrumentBrand() {
        Instrument inst = new Instrument();
        setInstrumentBrand("Gibson");

        Assertions.assertEquals("Gibson", getInstrumentBrand());
    }

    @Test
    void getTestInstrumentAge() {
        Instrument inst = new Instrument();
        setInstrumentAge(10);

        Assertions.assertEquals(10, getInstrumentAge());
    }

    @Test
    void setTestInstrumentAge() {
        Instrument inst = new Instrument();
        setInstrumentAge(10);

        Assertions.assertEquals(10, getInstrumentAge());
    }

    @Test
    void getTestInstrumentCond() {
        Instrument inst = new Instrument();
        setInstrumentCond("Good");

        Assertions.assertEquals("Good",getInstrumentCond());
    }

    @Test
    void setTestInstrumentCond() {
        Instrument inst = new Instrument();
        setInstrumentCond("Good");

        Assertions.assertEquals("Good",getInstrumentCond());
    }

    @Test
    void getTestInstrumentType() {
        Instrument inst = new Instrument();
        setInstrumentType("Electric");

        Assertions.assertEquals("Electric", getInstrumentType());
    }

    @Test
    void setTestInstrumentType() {
        Instrument inst = new Instrument();
        setInstrumentType("Electric");

        Assertions.assertEquals("Electric", getInstrumentType());
    }

    @Test
    void getTestInstrumentMat() {
        Instrument inst = new Instrument();
        setInstrumentMat("Rosewood");

        Assertions.assertEquals("Rosewood", getInstrumentMat());
    }

    @Test
    void setTestInstrumentMat() {
        Instrument inst = new Instrument();
        setInstrumentMat("Rosewood");

        Assertions.assertEquals("Rosewood", getInstrumentMat());
    }

    @Test
    void getTestNumStrings() {
        Instrument inst = new Instrument();
        setNumStrings(6);

        Assertions.assertEquals(6,getNumStrings());
    }

    @Test
    void setTestNumStrings() {
        Instrument inst = new Instrument();
        setNumStrings(6);

        Assertions.assertEquals(6,getNumStrings());
    }
}
