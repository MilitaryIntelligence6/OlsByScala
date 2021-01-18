package cn.misection.ols

import smile.data.formula.Formula
import smile.read
import smile.regression.{OLS, lm}

/**
 * @ClassName App
 * @author Military Intelligence 6 Admin
 * @version 1.0.0
 * @Description TODO
 * @createTime 2021年01月15日 22:35:00
 */
object Application
{
    def main(args: Array[String]): Unit =
    {
        val planes = read.arff("src/main/resources/arff/artcData08.csv.arff");
        val model = lm(Formula.lhs("y"), planes);
        println(model);
    }
}
