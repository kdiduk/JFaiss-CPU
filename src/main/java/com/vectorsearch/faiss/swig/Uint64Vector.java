/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vectorsearch.faiss.swig;

public class Uint64Vector {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Uint64Vector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Uint64Vector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        swigfaissJNI.delete_Uint64Vector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Uint64Vector() {
    this(swigfaissJNI.new_Uint64Vector(), true);
  }

  public void push_back(long arg0) {
    swigfaissJNI.Uint64Vector_push_back(swigCPtr, this, arg0);
  }

  public void clear() {
    swigfaissJNI.Uint64Vector_clear(swigCPtr, this);
  }

  public SWIGTYPE_p_unsigned_long data() {
    long cPtr = swigfaissJNI.Uint64Vector_data(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_long(cPtr, false);
  }

  public long size() {
    return swigfaissJNI.Uint64Vector_size(swigCPtr, this);
  }

  public long at(long n) {
    return swigfaissJNI.Uint64Vector_at(swigCPtr, this, n);
  }

  public void resize(long n) {
    swigfaissJNI.Uint64Vector_resize(swigCPtr, this, n);
  }

  public void swap(Uint64Vector other) {
    swigfaissJNI.Uint64Vector_swap(swigCPtr, this, Uint64Vector.getCPtr(other), other);
  }

}
