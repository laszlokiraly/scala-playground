package simpletest

class SimpleCalculatorTest extends org.scalatest.funsuite.AnyFunSuite {
  
  test("SimpleCalculator.add") {
    assert(SimpleCalculator.add(2,2) === 4)
  }

}