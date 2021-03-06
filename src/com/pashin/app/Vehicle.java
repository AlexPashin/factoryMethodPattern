package com.pashin.app;

import com.pashin.app.visitor.VehicleVisitor;
import com.pashin.exceptions.DuplicateModelNameException;
import com.pashin.exceptions.NoSuchModelNameException;

import java.io.Serializable;

public interface Vehicle extends Serializable, Cloneable {
    String getBrand();

    void setBrand(String brand);

    String[] getAllModelsName();

    double getModelPriceByName(String modelName) throws NoSuchModelNameException;

    void setModelPriceByName(String modelName, double newModelPrice) throws NoSuchModelNameException;

    void setModelNameByName(String modelName, String newModelName) throws NoSuchModelNameException, DuplicateModelNameException;

    double[] getAllModelsPrice();

    void addModel(String modelName, double price) throws DuplicateModelNameException;

    void deleteModel(String modelName) throws NoSuchModelNameException;

    int lengthOfModels();

    Vehicle clone() throws CloneNotSupportedException;

    void accept(VehicleVisitor visitor);
}
