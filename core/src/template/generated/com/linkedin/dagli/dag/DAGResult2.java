// AUTOGENERATED CODE.  DO NOT MODIFY DIRECTLY!  Instead, please modify the dag/DAGResultX.ftl file.
// See the README in the module's src/template directory for details.
package com.linkedin.dagli.dag;

import com.linkedin.dagli.objectio.ObjectReader;
import com.linkedin.dagli.tuple.Tuple2;


/**
 * Interface for obtaining the results of executing a DAG.  As a DAG may have multiple <i>output nodes</i>, whose result
 * values are the "outputs" of the DAG.  These may be retrieved together (as a tuple) directly from this interface
 * (which extends {@link ObjectReader}), or individually via the getResultX() methods.
 *
 * The ordering of the outputs is determined when the DAG is created, matching the order of the outputs passed in the
 * DAG.withPlaceholders(...).withOutputs(...) call.
 *
 * @param <RA> the type of result #1 of the DAG
 * @param <RB> the type of result #2 of the DAG
 */
public interface DAGResult2<RA, RB> extends ObjectReader<Tuple2<RA, RB>> {
  /**
   * Gets the results produced by the first output node of the DAG as an {@link ObjectReader}.  This
   * {@link ObjectReader} is parallel to the examples inputted to the DAG: that is, the ith value of the
   * {@link ObjectReader} corresponds to the ith example.  The size of the {@link ObjectReader} will (of course) also
   * equal the number of examples.
   *
   * @return the values produced by the first output node of the DAG for the inputted examples
   */
  public abstract ObjectReader<RA> getResult1();

  /**
   * Gets the results produced by the second output node of the DAG as an {@link ObjectReader}.  This
   * {@link ObjectReader} is parallel to the examples inputted to the DAG: that is, the ith value of the
   * {@link ObjectReader} corresponds to the ith example.  The size of the {@link ObjectReader} will (of course) also
   * equal the number of examples.
   *
   * @return the values produced by the second output node of the DAG for the inputted examples
   */
  public abstract ObjectReader<RB> getResult2();
}
