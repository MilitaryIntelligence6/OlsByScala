package cn.misection.ols.entity

import smile.data.formula.Formula
import smile.read
import smile.regression.{LinearModel, lm}
import smile.validation.Sensitivity

/**
 * @ClassName MyOls
 * @author Military Intelligence 6 Admin
 * @version 1.0.0
 * @Description TODO
 * @createTime 2021年01月15日 23:44:00
 */
class MyOls
{
    def regress(dataPath: String, y: String): LinearModel =
    {
        val planes = read.arff(dataPath);
        val model = lm(Formula.lhs(y), planes);
//        new Sensitivity().
        return model;
    }
}
