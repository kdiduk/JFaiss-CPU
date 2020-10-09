/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.vectorsearch.faiss.swig;

public class BufferedIOReader extends IOReader {
  private transient long swigCPtr;

  protected BufferedIOReader(long cPtr, boolean cMemoryOwn) {
    super(swigfaissJNI.BufferedIOReader_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BufferedIOReader obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        swigfaissJNI.delete_BufferedIOReader(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void setReader(IOReader value) {
    swigfaissJNI.BufferedIOReader_reader_set(swigCPtr, this, IOReader.getCPtr(value), value);
  }

  public IOReader getReader() {
    long cPtr = swigfaissJNI.BufferedIOReader_reader_get(swigCPtr, this);
    return (cPtr == 0) ? null : new IOReader(cPtr, false);
  }

  public void setBsz(long value) {
    swigfaissJNI.BufferedIOReader_bsz_set(swigCPtr, this, value);
  }

  public long getBsz() {
    return swigfaissJNI.BufferedIOReader_bsz_get(swigCPtr, this);
  }

  public void setTotsz(long value) {
    swigfaissJNI.BufferedIOReader_totsz_set(swigCPtr, this, value);
  }

  public long getTotsz() {
    return swigfaissJNI.BufferedIOReader_totsz_get(swigCPtr, this);
  }

  public void setOfs(long value) {
    swigfaissJNI.BufferedIOReader_ofs_set(swigCPtr, this, value);
  }

  public long getOfs() {
    return swigfaissJNI.BufferedIOReader_ofs_get(swigCPtr, this);
  }

  public void setB0(long value) {
    swigfaissJNI.BufferedIOReader_b0_set(swigCPtr, this, value);
  }

  public long getB0() {
    return swigfaissJNI.BufferedIOReader_b0_get(swigCPtr, this);
  }

  public void setB1(long value) {
    swigfaissJNI.BufferedIOReader_b1_set(swigCPtr, this, value);
  }

  public long getB1() {
    return swigfaissJNI.BufferedIOReader_b1_get(swigCPtr, this);
  }

  public void setBuffer(CharVector value) {
    swigfaissJNI.BufferedIOReader_buffer_set(swigCPtr, this, CharVector.getCPtr(value), value);
  }

  public CharVector getBuffer() {
    long cPtr = swigfaissJNI.BufferedIOReader_buffer_get(swigCPtr, this);
    return (cPtr == 0) ? null : new CharVector(cPtr, false);
  }

  public BufferedIOReader(IOReader reader, long bsz, long totsz) {
    this(swigfaissJNI.new_BufferedIOReader__SWIG_0(IOReader.getCPtr(reader), reader, bsz, totsz), true);
  }

  public BufferedIOReader(IOReader reader, long bsz) {
    this(swigfaissJNI.new_BufferedIOReader__SWIG_1(IOReader.getCPtr(reader), reader, bsz), true);
  }

}
