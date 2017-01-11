package io.confluent.kql.function.udf.string;


import io.confluent.kql.function.KQLFunctionException;
import io.confluent.kql.function.udf.KUDF;

public class Len_KUDF implements KUDF {

  @Override
  public void init() {

  }

  @Override
  public Object evaluate(Object... args) {
    if (args.length != 1) {
      throw new KQLFunctionException("Length udf should have one input argument.");
    }
    return args[0].toString().length();
  }
}
