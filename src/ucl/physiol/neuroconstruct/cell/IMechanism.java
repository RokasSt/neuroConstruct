/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ucl.physiol.neuroconstruct.cell;

import java.util.ArrayList;

/**
 *
 * @author boris
 */
public interface IMechanism {

    Object clone();

    @Override
    boolean equals(Object otherObj);

    MechParameter getExtraParameter(String paramName);

    ArrayList<MechParameter> getExtraParameters();

    String getExtraParamsBracket();

    String getExtraParamsDesc();
    
    String getNML2Name();

    String getName();

    void setExtraParam(String name, float value);

    void setExtraParameters(ArrayList<MechParameter> params);

    void setName(String name);

    @Override
    String toString();
    
}
