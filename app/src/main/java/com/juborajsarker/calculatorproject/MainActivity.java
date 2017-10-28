package com.juborajsarker.calculatorproject;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.udojava.evalex.Expression;

import java.math.BigDecimal;
import java.sql.SQLException;


public class MainActivity extends AppCompatActivity {

    TextView inputTV, outputTV;

    String htmlStringWithMathSymbols = "&#247;";

    BigDecimal answer = null;

    boolean dotClick, percentClick = true;
    boolean plusBtnClick, mynusBtnClick, multiplyBtnClick, devideBtnClick, equalBtnClick = false;
    boolean firstDot, firstAnswer = false;


    Expression expression;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputTV = (TextView) findViewById(R.id.input_TV);
        outputTV = (TextView) findViewById(R.id.output_TV);
        answer = BigDecimal.valueOf(0);
        dotClick = true;


    }


    public void btnClick(View view) throws SQLException, ClassNotFoundException {

        switch (view.getId()){

            case R.id.btn_one:{

                if (equalBtnClick){

                    inputTV.setText("1");

                    plusBtnClick = true;
                    mynusBtnClick = true;
                    multiplyBtnClick = true;
                    devideBtnClick = true;
                    equalBtnClick = false;
                    firstDot = false;


                }else {

                    inputTV.append("1");

                    plusBtnClick = true;
                    mynusBtnClick = true;
                    multiplyBtnClick = true;
                    devideBtnClick = true;
                    firstDot = false;
                }

                break;
            }


            case R.id.btn_two:{

                if (equalBtnClick){

                    inputTV.setText("2");

                    plusBtnClick = true;
                    mynusBtnClick = true;
                    multiplyBtnClick = true;
                    devideBtnClick = true;
                    equalBtnClick = false;
                    firstDot = false;


                }else {

                    inputTV.append("2");

                    plusBtnClick = true;
                    mynusBtnClick = true;
                    multiplyBtnClick = true;
                    devideBtnClick = true;
                    firstDot = false;
                }

                break;
            }


            case R.id.btn_three:{

                if (equalBtnClick){

                    inputTV.setText("3");

                    plusBtnClick = true;
                    mynusBtnClick = true;
                    multiplyBtnClick = true;
                    devideBtnClick = true;
                    equalBtnClick = false;
                    firstDot = false;


                }else {

                    inputTV.append("3");

                    plusBtnClick = true;
                    mynusBtnClick = true;
                    multiplyBtnClick = true;
                    devideBtnClick = true;
                    firstDot = false;
                }

                break;
            }



            case R.id.btn_four:{

                if (equalBtnClick){

                    inputTV.setText("4");

                    plusBtnClick = true;
                    mynusBtnClick = true;
                    multiplyBtnClick = true;
                    devideBtnClick = true;
                    equalBtnClick = false;
                    firstDot = false;


                }else {

                    inputTV.append("4");

                    plusBtnClick = true;
                    mynusBtnClick = true;
                    multiplyBtnClick = true;
                    devideBtnClick = true;
                    firstDot = false;
                }

                break;
            }



            case R.id.btn_five:{

                if (equalBtnClick){

                    inputTV.setText("5");

                    plusBtnClick = true;
                    mynusBtnClick = true;
                    multiplyBtnClick = true;
                    devideBtnClick = true;
                    equalBtnClick = false;
                    firstDot = false;


                }else {

                    inputTV.append("5");

                    plusBtnClick = true;
                    mynusBtnClick = true;
                    multiplyBtnClick = true;
                    devideBtnClick = true;
                    firstDot = false;
                }

                break;
            }



            case R.id.btn_six:{

                if (equalBtnClick){

                    inputTV.setText("6");

                    plusBtnClick = true;
                    mynusBtnClick = true;
                    multiplyBtnClick = true;
                    devideBtnClick = true;
                    equalBtnClick = false;
                    firstDot = false;


                }else {

                    inputTV.append("6");

                    plusBtnClick = true;
                    mynusBtnClick = true;
                    multiplyBtnClick = true;
                    devideBtnClick = true;
                    firstDot = false;
                }

                break;
            }



            case R.id.btn_seven:{

                if (equalBtnClick){

                    inputTV.setText("7");

                    plusBtnClick = true;
                    mynusBtnClick = true;
                    multiplyBtnClick = true;
                    devideBtnClick = true;
                    equalBtnClick = false;
                    firstDot = false;


                }else {

                    inputTV.append("7");

                    plusBtnClick = true;
                    mynusBtnClick = true;
                    multiplyBtnClick = true;
                    devideBtnClick = true;
                    firstDot = false;
                }

                break;
            }



            case R.id.btn_eight:{

                if (equalBtnClick){

                    inputTV.setText("8");

                    plusBtnClick = true;
                    mynusBtnClick = true;
                    multiplyBtnClick = true;
                    devideBtnClick = true;
                    equalBtnClick = false;
                    firstDot = false;


                }else {

                    inputTV.append("8");

                    plusBtnClick = true;
                    mynusBtnClick = true;
                    multiplyBtnClick = true;
                    devideBtnClick = true;
                    firstDot = false;
                }

                break;
            }


            case R.id.btn_nine:{

                if (equalBtnClick){

                    inputTV.setText("9");

                    plusBtnClick = true;
                    mynusBtnClick = true;
                    multiplyBtnClick = true;
                    devideBtnClick = true;
                    equalBtnClick = false;
                    firstDot = false;


                }else {

                    inputTV.append("9");

                    plusBtnClick = true;
                    mynusBtnClick = true;
                    multiplyBtnClick = true;
                    devideBtnClick = true;
                    firstDot = false;
                }

                break;
            }


            case R.id.btn_point:{

                if (dotClick){


                    if (equalBtnClick){



                            inputTV.setText("0.");

                            plusBtnClick = true;
                            mynusBtnClick = true;
                            multiplyBtnClick = true;
                            devideBtnClick = true;
                            equalBtnClick = false;
                            dotClick = false;




                    }else {

                        if (inputTV.getText().toString().length()<1){

                            inputTV.append("0.");

                            plusBtnClick = true;
                            mynusBtnClick = true;
                            multiplyBtnClick = true;
                            devideBtnClick = true;
                            dotClick = false;
                            firstDot = false;

                        }else {


                            if (firstDot){

                                inputTV.append("0.");

                                plusBtnClick = true;
                                mynusBtnClick = true;
                                multiplyBtnClick = true;
                                devideBtnClick = true;
                                dotClick = false;
                                firstDot = false;
                            }else {

                                inputTV.append(".");

                                plusBtnClick = true;
                                mynusBtnClick = true;
                                multiplyBtnClick = true;
                                devideBtnClick = true;
                                dotClick = false;
                                firstDot = false;
                            }


                        }
                    }

                }

                break;
            }



            case R.id.btn_zero:{

                if (equalBtnClick){

                    inputTV.setText("0");

                    plusBtnClick = true;
                    mynusBtnClick = true;
                    multiplyBtnClick = true;
                    devideBtnClick = true;
                    equalBtnClick = false;
                    firstDot = false;


                }else {

                    inputTV.append("0");

                    plusBtnClick = true;
                    mynusBtnClick = true;
                    multiplyBtnClick = true;
                    devideBtnClick = true;
                    firstDot = false;
                }

                break;
            }


            case R.id.btn_negative:{

                if (equalBtnClick){

                    inputTV.setText("-");

                    plusBtnClick = true;
                    mynusBtnClick = true;
                    multiplyBtnClick = true;
                    devideBtnClick = true;
                    equalBtnClick = false;


                }else {

                    inputTV.append("-");

                    plusBtnClick = true;
                    mynusBtnClick = true;
                    multiplyBtnClick = true;
                    devideBtnClick = true;
                }


                break;
            }



            case R.id.btn_clear:{

                inputTV.setText("");
                outputTV.setText("");

                plusBtnClick = false;
                mynusBtnClick = false;
                multiplyBtnClick = false;
                devideBtnClick = false;

                dotClick = true;
                firstDot = true;
                percentClick = true;

                break;
            }



            case R.id.btn_c:{

                equalBtnClick = false;
                if (inputTV.getText().toString().length()>0){

                    if ( inputTV.getText().toString().endsWith("+") || inputTV.getText().toString().endsWith("-")
                            || inputTV.getText().toString().endsWith("*") || inputTV.getText().toString().endsWith("/")){

                        plusBtnClick = true;
                        mynusBtnClick = true;
                        multiplyBtnClick = true;
                        devideBtnClick = true;

                    }

                    if (inputTV.getText().toString().endsWith(".")){


                        dotClick = true;
                    }

                    String getString = inputTV.getText().toString().substring(0, inputTV.getText().toString().length() - 1);
                    inputTV.setText(getString);
                }

                else {

                    inputTV.setText("");
                }
                break;
            }




            case R.id.btn_plus:{

                if (plusBtnClick){

                    inputTV.append("+");
                    plusBtnClick = false;
                    mynusBtnClick = false;
                    multiplyBtnClick = false;
                    devideBtnClick = false;
                    dotClick = true;
                    firstDot = true;
                    firstAnswer = false;
                }


                if (equalBtnClick){


                    if (inputTV.getText().toString().length()>0){

                        inputTV.setText(outputTV.getText().toString().substring( 1, outputTV.getText().toString().length()) + "+");
                        equalBtnClick = false;

                        plusBtnClick = false;
                        mynusBtnClick = false;
                        multiplyBtnClick = false;
                        devideBtnClick = false;
                        dotClick = true;
                        firstDot = true;
                        firstAnswer = false;
                    }
                }

                break;
            }




            case R.id.btn_mynus:{

                if (mynusBtnClick){

                    inputTV.append("-");

                    plusBtnClick = false;
                    mynusBtnClick = false;
                    multiplyBtnClick = false;
                    devideBtnClick = false;
                    dotClick = true;
                    firstDot = true;

                    firstAnswer = false;
                }



                if (equalBtnClick){


                    if (inputTV.getText().toString().length()>0){

                        inputTV.setText(outputTV.getText().toString().substring( 1, outputTV.getText().toString().length()) + "-");
                        equalBtnClick = false;

                        plusBtnClick = false;
                        mynusBtnClick = false;
                        multiplyBtnClick = false;
                        devideBtnClick = false;
                        dotClick = true;
                        firstDot = true;

                        firstAnswer = false;
                    }
                }

                break;
            }




            case R.id.btn_multiply:{

                if (multiplyBtnClick){

                    inputTV.append("*");

                    plusBtnClick = false;
                    mynusBtnClick = false;
                    multiplyBtnClick = false;
                    devideBtnClick = false;
                    dotClick = true;
                    firstDot = true;

                    firstAnswer = false;
                }



                if (equalBtnClick){


                    if (inputTV.getText().toString().length()>0){

                        inputTV.setText(outputTV.getText().toString().substring( 1, outputTV.getText().toString().length()) + "*");
                        equalBtnClick = false;

                        plusBtnClick = false;
                        mynusBtnClick = false;
                        multiplyBtnClick = false;
                        devideBtnClick = false;
                        dotClick = true;
                        firstDot = true;

                        firstAnswer = false;
                    }
                }



                break;
            }



            case R.id.btn_devide:{

                if (devideBtnClick){

                    inputTV.append("/");

                    plusBtnClick = false;
                    mynusBtnClick = false;
                    multiplyBtnClick = false;
                    devideBtnClick = false;
                    dotClick = true;
                    firstDot = true;

                    firstAnswer = false;
                }


                if (equalBtnClick){


                    if (inputTV.getText().toString().length()>0){



                        inputTV.setText(outputTV.getText().toString().substring( 1, outputTV.getText().toString().length()) + "/");
                        equalBtnClick = false;

                        plusBtnClick = false;
                        mynusBtnClick = false;
                        multiplyBtnClick = false;
                        devideBtnClick = false;
                        dotClick = true;
                        firstDot = true;



                        firstAnswer = false;
                    }
                }

                break;
            }


//            case R.id.btn_ans:{
//
//
//                if (inputTV.getText().toString().length()>0){
//
//                    if (firstAnswer){
//
//                        inputTV.setText(String.valueOf(answer));
//                        equalBtnClick = false;
//
//                        plusBtnClick = true;
//                        mynusBtnClick = true;
//                        multiplyBtnClick = true;
//                        devideBtnClick = true;
//                        firstAnswer = false;
//
//                    }else {
//
//                        inputTV.append(String.valueOf(answer));
//                        equalBtnClick = false;
//
//                        plusBtnClick = true;
//                        mynusBtnClick = true;
//                        multiplyBtnClick = true;
//                        devideBtnClick = true;
//                        firstAnswer = false;
//
//                    }
//
//
//
//                }else {
//
//                    inputTV.setText(String.valueOf(answer));
//                    equalBtnClick = false;
//
//                    plusBtnClick = true;
//                    mynusBtnClick = true;
//                    multiplyBtnClick = true;
//                    devideBtnClick = true;
//                }
//
//                break;
//            }





            case R.id.btn_equal:{


                BigDecimal result = null;
                Long finalResult = Long.valueOf(0);

                if (inputTV.getText().toString().length()>0){


                    try{

                        expression = new Expression(inputTV.getText().toString());

                        result = expression.eval();









                        if (String.valueOf(result).contains("E")){


                            finalResult = result.longValue();

                        }

                        if (finalResult !=0 ){

                            outputTV.setText("= "+String.valueOf(finalResult));
                            answer = BigDecimal.valueOf(finalResult);

                        }else {

                            outputTV.setText("= "+String.valueOf(result));
                            answer = result;
                        }

                        outputTV.setTextColor(Color.BLACK);
                        equalBtnClick = true;

                        plusBtnClick = false;
                        mynusBtnClick = false;
                        multiplyBtnClick = false;
                        devideBtnClick = false;
                        dotClick = true;

                        firstAnswer = true;

                    } catch(Expression.ExpressionException e ){

                        outputTV.setText("Wrong format !!!");
                        outputTV.setTextColor(Color.RED);

                    }catch (ArithmeticException e){

                        outputTV.setText("cannot divide by zero !!!");
                        outputTV.setTextColor(Color.RED);
                    }

                    finally {




                    }




                }





                break;
            }






        }



    }







}
