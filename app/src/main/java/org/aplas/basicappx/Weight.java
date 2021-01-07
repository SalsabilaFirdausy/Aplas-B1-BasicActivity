package org.aplas.basicappx;

public class Weight {
    private double gram;

    public Weight() {

    }

    public void setGram(double gram) {
        this.gram = gram;
    }

    public void setOunce(double ounce){
        this.gram = ounce * 28.3495231;
    }

    public void setPound(double pound){
        this.gram = pound * 453.59237;
    }

    public double getGram() {
        return gram;
    }

    public double getOunce(){
        return (this.gram / 28.3495231) ;
    }

    public double getPound(){
        return (this.gram / 453.59237);
    }

    public double convert(String oriUnit, String convUnit, double value){
        if (oriUnit.equals("Grm")){
            switch (convUnit){
                case "Grm":
                    setGram(value);
                    value = getGram();
                    break;
                case "Onc":
                    setOunce(value);
                    value = getOunce();
                    break;
                case "Pnd":
                    setPound(value);
                    value = getPound();
                    break;
            }
        }else if(oriUnit.equals("Onc")){
            switch (convUnit){
                case "Grm":
                    setGram(value);
                    value = getGram();
                    break;
                case "Onc":
                    setOunce(value);
                    value = getOunce();
                    break;
                case "Pnd":
                    setPound(value);
                    value = getPound();
                    break;
            }

        }else if(oriUnit.equals("Pnd")){
            switch (convUnit){
                case "Grm":
                    setGram(value);
                    value = getGram();
                    break;
                case "Onc":
                    setOunce(value);
                    value = getOunce();
                    break;
                case "Pnd":
                    setPound(value);
                    value = getPound();
                    break;
            }
        }
        return value;
    }
}
