/*
AvoidInlineConditionals


*/

package com . puppycrawl
    .tools.
    checkstyle.checks.coding.avoidinlineconditionals;

/**
 * Class for testing inline conditionals.
 * violation missing author tag
 **/
class InputAvoidInlineConditionals
{
    /** method **/
    void method1()
    {
        final int a = 1;
        int b= 1; // Ignore 1
        b=1; // Ignore 1
        b+=1; // Ignore 1
        b -=- 1 + (+ b); // Ignore 2
        b = b ++ + b --; // Ignore 1
        b = ++ b - -- b; // Ignore 1
    }

    private int mVar4 = 1;

    /** test questions **/
    private void testQuestions()
    {
        boolean b = (1 == 2)?true:false; // violation 'Avoid inline conditionals'
        b = (1==2) ? false : true; // violation 'Avoid inline conditionals'
    }

    /** assert statement test */
    public void assertTest()
    {

        assert true;


        assert true : "Whups";

        // evil colons, should be OK
        assert "OK".equals(null) ? false : true : "Whups"; // violation 'Avoid inline conditionals'

        // missing WS around assert
        assert(true);

        // missing WS around colon
        assert true:"Whups";
    }
}
