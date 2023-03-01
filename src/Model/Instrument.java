package Model;

public class Instrument {
    private String instrumentName;
    private String instrumentBrand;
    private int instrumentAge;
    private String instrumentCond;
    private String instrumentType;
    private String instrumentMat;
    private int numStrings;

    /**
     * This is the default constructor for the Model.Instrument class.
     */

    public Instrument()
    {

    }

    /**
     * returns name of instrument
     * @return string of instrument name
     */

    public String getInstrumentName()
    {
        return this.instrumentName;
    }

    /**
     * sets instrument name
     * @param name sets the instrument name
     */
    public void setInstrumentName(String name)
    {
        this.instrumentName = name;
    }

    /**
     * returns instrument brand
     * @return instrument brand name
     */
    public String getInstrumentBrand()
    {
        return this.instrumentBrand;
    }

    /**
     * sets the instrument brand name
     * @param brand sets instrument brand name
     */

    public void setInstrumentBrand(String brand)
    {
        this.instrumentBrand = brand;
    }

    /**
     * returns instrument age
     * @return instrument age number
     */

    public int getInstrumentAge()
    {
        return this.instrumentAge;
    }

    /**
     * sets instrument age
     * @param age sets number for instrument age
     */

    public void setInstrumentAge(int age)
    {
        this.instrumentAge = age;
    }

    /**
     * returns instrument condition
     * @return instrument condition
     */

    public String getInstrumentCond()
    {
        return this.instrumentCond;
    }

    /**
     * sets instrument condition
     * @param condition sets the instrument condition
     */
    public void setInstrumentCond(String condition)
    {
        this.instrumentCond = condition;
    }

    /**
     * returns instrument type
     * @return instrument type string
     */
    public String getInstrumentType()
    {
        return this.instrumentType;
    }

    /**
     * sets the instrument type
     * @param type sets the instrument type
     */
    public void setInstrumentType(String type)
    {
        this.instrumentType = type;
    }

    /**
     * returns instrument materials
     * @return instrument material string
     */

    public String getInstrumentMat()
    {
        return this.instrumentMat;
    }

    /**
     * sets instrument material
     * @param material sets instrument material string
     */

    public void setInstrumentMat(String material)
    {
        this.instrumentMat = material;
    }

    /**
     * returns number of strings for instrument
     * @return number of strings for instrument
     */

    public int getNumStrings()
    {
        return this.numStrings;
    }

    /**
     * sets the number of strings for instrument
     * @param stringNum sets the number of strings for instrument
     */
    public void setNumStrings(int stringNum)
    {
        this.numStrings = stringNum;
    }
}
