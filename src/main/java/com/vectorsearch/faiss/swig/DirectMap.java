/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vectorsearch.faiss.swig;

public class DirectMap {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected DirectMap(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(DirectMap obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        swigfaissJNI.delete_DirectMap(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setType(DirectMap.Type value) {
    swigfaissJNI.DirectMap_type_set(swigCPtr, this, value.swigValue());
  }

  public DirectMap.Type getType() {
    return DirectMap.Type.swigToEnum(swigfaissJNI.DirectMap_type_get(swigCPtr, this));
  }

  public void setArray(LongVector value) {
    swigfaissJNI.DirectMap_array_set(swigCPtr, this, LongVector.getCPtr(value), value);
  }

  public LongVector getArray() {
    long cPtr = swigfaissJNI.DirectMap_array_get(swigCPtr, this);
    return (cPtr == 0) ? null : new LongVector(cPtr, false);
  }

  public void setHashtable(SWIGTYPE_p_std__unordered_mapT_long_long_t value) {
    swigfaissJNI.DirectMap_hashtable_set(swigCPtr, this, SWIGTYPE_p_std__unordered_mapT_long_long_t.getCPtr(value));
  }

  public SWIGTYPE_p_std__unordered_mapT_long_long_t getHashtable() {
    return new SWIGTYPE_p_std__unordered_mapT_long_long_t(swigfaissJNI.DirectMap_hashtable_get(swigCPtr, this), true);
  }

  public DirectMap() {
    this(swigfaissJNI.new_DirectMap(), true);
  }

  public void set_type(DirectMap.Type new_type, InvertedLists invlists, long ntotal) {
    swigfaissJNI.DirectMap_set_type(swigCPtr, this, new_type.swigValue(), InvertedLists.getCPtr(invlists), invlists, ntotal);
  }

  public int get(int id) {
    return swigfaissJNI.DirectMap_get(swigCPtr, this, id);
  }

  public boolean no() {
    return swigfaissJNI.DirectMap_no(swigCPtr, this);
  }

  public void check_can_add(SWIGTYPE_p_long ids) {
    swigfaissJNI.DirectMap_check_can_add(swigCPtr, this, SWIGTYPE_p_long.getCPtr(ids));
  }

  public void add_single_id(int id, int list_no, long offset) {
    swigfaissJNI.DirectMap_add_single_id(swigCPtr, this, id, list_no, offset);
  }

  public void clear() {
    swigfaissJNI.DirectMap_clear(swigCPtr, this);
  }

  public long remove_ids(IDSelector sel, InvertedLists invlists) {
    return swigfaissJNI.DirectMap_remove_ids(swigCPtr, this, IDSelector.getCPtr(sel), sel, InvertedLists.getCPtr(invlists), invlists);
  }

  public void update_codes(InvertedLists invlists, int n, SWIGTYPE_p_long ids, SWIGTYPE_p_long list_nos, SWIGTYPE_p_unsigned_char codes) {
    swigfaissJNI.DirectMap_update_codes(swigCPtr, this, InvertedLists.getCPtr(invlists), invlists, n, SWIGTYPE_p_long.getCPtr(ids), SWIGTYPE_p_long.getCPtr(list_nos), SWIGTYPE_p_unsigned_char.getCPtr(codes));
  }

  public final static class Type {
    public final static DirectMap.Type NoMap = new DirectMap.Type("NoMap", swigfaissJNI.DirectMap_NoMap_get());
    public final static DirectMap.Type Array = new DirectMap.Type("Array", swigfaissJNI.DirectMap_Array_get());
    public final static DirectMap.Type Hashtable = new DirectMap.Type("Hashtable", swigfaissJNI.DirectMap_Hashtable_get());

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static Type swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + Type.class + " with value " + swigValue);
    }

    private Type(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private Type(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private Type(String swigName, Type swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static Type[] swigValues = { NoMap, Array, Hashtable };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}
