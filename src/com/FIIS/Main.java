package com.FIIS;

import com.FIIS.modelosalgoritmos.*;

public class Main {
    public static void main(String[] args) {
        //MLJ48 mlJ48Test = new MLJ48("file:///C:/Users/corzo/Desktop/PC%202%20IAA%20JOS%C3%89%20CORZO/src/com/datasets/iris-test.arff");
       // MLJ48 mlJ48Train = new MLJ48("file:///C:/Users/corzo/Desktop/PC%202%20IAA%20JOS%C3%89%20CORZO/src/com/datasets/iris-train.arff");
       MLNaiveBayes mlBAYESTest = new MLNaiveBayes("file:///C:/Users/corzo/Desktop/PC%202%20IAA%20JOS%C3%89%20CORZO/src/com/datasets/iris-test.arff");
       MLNaiveBayes mlBAYESTrain = new MLNaiveBayes("file:///C:/Users/corzo/Desktop/PC%202%20IAA%20JOS%C3%89%20CORZO/src/com/datasets/iris-train.arff");
       // MLSMOreg mlSMOTest = new MLSMOreg("file:///C:/Users/corzo/Desktop/PC%202%20IAA%20JOS%C3%89%20CORZO/src/com/datasets/iris-test.arff");
       // MLSMOreg mlSMOTrain = new MLSMOreg("file:///C:/Users/corzo/Desktop/PC%202%20IAA%20JOS%C3%89%20CORZO/src/com/datasets/iris-train.arff");
        //MLLibSVMTest mllSVMTest = new MLLibSVMTest("file:///C:/Users/corzo/Desktop/PC%202%20IAA%20JOS%C3%89%20CORZO/src/com/datasets/ReutersGrain-test.arff");
       // MLLibSVMTest mllSVMTrain = new MLLibSVMTest("file:///C:/Users/corzo/Desktop/PC%202%20IAA%20JOS%C3%89%20CORZO/src/com/datasets/ReutersGrain-train.arff");
       //MLReptree mlREPTREETest = new MLReptree("file:///C:/Users/corzo/Desktop/PC%202%20IAA%20JOS%C3%89%20CORZO/src/com/datasets/iris-test.arff");
        //MLReptree mlREPTREETrain = new MLReptree("file:///C:/Users/corzo/Desktop/PC%202%20IAA%20JOS%C3%89%20CORZO/src/com/datasets/iris-train.arff");
    }
}
