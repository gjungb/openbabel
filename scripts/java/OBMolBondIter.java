/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.31
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class OBMolBondIter {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected OBMolBondIter(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(OBMolBondIter obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      openbabelJNI.delete_OBMolBondIter(swigCPtr);
    }
    swigCPtr = 0;
  }

  public OBMolBondIter() {
    this(openbabelJNI.new_OBMolBondIter__SWIG_0(), true);
  }

  public OBMolBondIter(OBMol mol) {
    this(openbabelJNI.new_OBMolBondIter__SWIG_1(OBMol.getCPtr(mol), mol), true);
  }

  public OBMolBondIter(OBMolBondIter bi) {
    this(openbabelJNI.new_OBMolBondIter__SWIG_2(OBMolBondIter.getCPtr(bi), bi), true);
  }

  public OBBond __deref__() {
    long cPtr = openbabelJNI.OBMolBondIter___deref__(swigCPtr, this);
    return (cPtr == 0) ? null : new OBBond(cPtr, false);
  }

  public OBBond __ref__() {
    return new OBBond(openbabelJNI.OBMolBondIter___ref__(swigCPtr, this), false);
  }

  public void setVisit(boolean value) {
    openbabelJNI.OBMolBondIter_Visit_set(swigCPtr, this, value);
  }

  public boolean getVisit() {
    return openbabelJNI.OBMolBondIter_Visit_get(swigCPtr, this);
  }

  public void SetIdx(int idx) {
    openbabelJNI.OBMolBondIter_SetIdx(swigCPtr, this, idx);
  }

  public void SetBO(int order) {
    openbabelJNI.OBMolBondIter_SetBO(swigCPtr, this, order);
  }

  public void SetBondOrder(int order) {
    openbabelJNI.OBMolBondIter_SetBondOrder(swigCPtr, this, order);
  }

  public void SetBegin(OBAtom begin) {
    openbabelJNI.OBMolBondIter_SetBegin(swigCPtr, this, OBAtom.getCPtr(begin), begin);
  }

  public void SetEnd(OBAtom end) {
    openbabelJNI.OBMolBondIter_SetEnd(swigCPtr, this, OBAtom.getCPtr(end), end);
  }

  public void SetParent(OBMol ptr) {
    openbabelJNI.OBMolBondIter_SetParent(swigCPtr, this, OBMol.getCPtr(ptr), ptr);
  }

  public void SetLength(OBAtom fixed, double length) {
    openbabelJNI.OBMolBondIter_SetLength(swigCPtr, this, OBAtom.getCPtr(fixed), fixed, length);
  }

  public void Set(int index, OBAtom begin, OBAtom end, int order, int flags) {
    openbabelJNI.OBMolBondIter_Set(swigCPtr, this, index, OBAtom.getCPtr(begin), begin, OBAtom.getCPtr(end), end, order, flags);
  }

  public void SetKSingle() {
    openbabelJNI.OBMolBondIter_SetKSingle(swigCPtr, this);
  }

  public void SetKDouble() {
    openbabelJNI.OBMolBondIter_SetKDouble(swigCPtr, this);
  }

  public void SetKTriple() {
    openbabelJNI.OBMolBondIter_SetKTriple(swigCPtr, this);
  }

  public void SetAromatic() {
    openbabelJNI.OBMolBondIter_SetAromatic(swigCPtr, this);
  }

  public void SetHash() {
    openbabelJNI.OBMolBondIter_SetHash(swigCPtr, this);
  }

  public void SetWedge() {
    openbabelJNI.OBMolBondIter_SetWedge(swigCPtr, this);
  }

  public void SetUp() {
    openbabelJNI.OBMolBondIter_SetUp(swigCPtr, this);
  }

  public void SetDown() {
    openbabelJNI.OBMolBondIter_SetDown(swigCPtr, this);
  }

  public void SetInRing() {
    openbabelJNI.OBMolBondIter_SetInRing(swigCPtr, this);
  }

  public void SetClosure() {
    openbabelJNI.OBMolBondIter_SetClosure(swigCPtr, this);
  }

  public void UnsetHash() {
    openbabelJNI.OBMolBondIter_UnsetHash(swigCPtr, this);
  }

  public void UnsetWedge() {
    openbabelJNI.OBMolBondIter_UnsetWedge(swigCPtr, this);
  }

  public void UnsetUp() {
    openbabelJNI.OBMolBondIter_UnsetUp(swigCPtr, this);
  }

  public void UnsetDown() {
    openbabelJNI.OBMolBondIter_UnsetDown(swigCPtr, this);
  }

  public void UnsetAromatic() {
    openbabelJNI.OBMolBondIter_UnsetAromatic(swigCPtr, this);
  }

  public void UnsetKekule() {
    openbabelJNI.OBMolBondIter_UnsetKekule(swigCPtr, this);
  }

  public long GetIdx() {
    return openbabelJNI.OBMolBondIter_GetIdx(swigCPtr, this);
  }

  public long GetBO() {
    return openbabelJNI.OBMolBondIter_GetBO(swigCPtr, this);
  }

  public long GetBondOrder() {
    return openbabelJNI.OBMolBondIter_GetBondOrder(swigCPtr, this);
  }

  public long GetFlags() {
    return openbabelJNI.OBMolBondIter_GetFlags(swigCPtr, this);
  }

  public long GetBeginAtomIdx() {
    return openbabelJNI.OBMolBondIter_GetBeginAtomIdx(swigCPtr, this);
  }

  public long GetEndAtomIdx() {
    return openbabelJNI.OBMolBondIter_GetEndAtomIdx(swigCPtr, this);
  }

  public OBAtom GetBeginAtom() {
    long cPtr = openbabelJNI.OBMolBondIter_GetBeginAtom__SWIG_0(swigCPtr, this);
    return (cPtr == 0) ? null : new OBAtom(cPtr, false);
  }

  public OBAtom GetEndAtom() {
    long cPtr = openbabelJNI.OBMolBondIter_GetEndAtom__SWIG_0(swigCPtr, this);
    return (cPtr == 0) ? null : new OBAtom(cPtr, false);
  }

  public OBAtom GetNbrAtom(OBAtom ptr) {
    long cPtr = openbabelJNI.OBMolBondIter_GetNbrAtom(swigCPtr, this, OBAtom.getCPtr(ptr), ptr);
    return (cPtr == 0) ? null : new OBAtom(cPtr, false);
  }

  public OBMol GetParent() {
    long cPtr = openbabelJNI.OBMolBondIter_GetParent(swigCPtr, this);
    return (cPtr == 0) ? null : new OBMol(cPtr, false);
  }

  public double GetEquibLength() {
    return openbabelJNI.OBMolBondIter_GetEquibLength(swigCPtr, this);
  }

  public double GetLength() {
    return openbabelJNI.OBMolBondIter_GetLength(swigCPtr, this);
  }

  public long GetNbrAtomIdx(OBAtom ptr) {
    return openbabelJNI.OBMolBondIter_GetNbrAtomIdx(swigCPtr, this, OBAtom.getCPtr(ptr), ptr);
  }

  public boolean IsAromatic() {
    return openbabelJNI.OBMolBondIter_IsAromatic(swigCPtr, this);
  }

  public boolean IsInRing() {
    return openbabelJNI.OBMolBondIter_IsInRing(swigCPtr, this);
  }

  public boolean IsRotor() {
    return openbabelJNI.OBMolBondIter_IsRotor(swigCPtr, this);
  }

  public boolean IsAmide() {
    return openbabelJNI.OBMolBondIter_IsAmide(swigCPtr, this);
  }

  public boolean IsPrimaryAmide() {
    return openbabelJNI.OBMolBondIter_IsPrimaryAmide(swigCPtr, this);
  }

  public boolean IsSecondaryAmide() {
    return openbabelJNI.OBMolBondIter_IsSecondaryAmide(swigCPtr, this);
  }

  public boolean IsEster() {
    return openbabelJNI.OBMolBondIter_IsEster(swigCPtr, this);
  }

  public boolean IsCarbonyl() {
    return openbabelJNI.OBMolBondIter_IsCarbonyl(swigCPtr, this);
  }

  public boolean IsSingle() {
    return openbabelJNI.OBMolBondIter_IsSingle(swigCPtr, this);
  }

  public boolean IsDouble() {
    return openbabelJNI.OBMolBondIter_IsDouble(swigCPtr, this);
  }

  public boolean IsTriple() {
    return openbabelJNI.OBMolBondIter_IsTriple(swigCPtr, this);
  }

  public boolean IsKSingle() {
    return openbabelJNI.OBMolBondIter_IsKSingle(swigCPtr, this);
  }

  public boolean IsKDouble() {
    return openbabelJNI.OBMolBondIter_IsKDouble(swigCPtr, this);
  }

  public boolean IsKTriple() {
    return openbabelJNI.OBMolBondIter_IsKTriple(swigCPtr, this);
  }

  public boolean IsClosure() {
    return openbabelJNI.OBMolBondIter_IsClosure(swigCPtr, this);
  }

  public boolean IsUp() {
    return openbabelJNI.OBMolBondIter_IsUp(swigCPtr, this);
  }

  public boolean IsDown() {
    return openbabelJNI.OBMolBondIter_IsDown(swigCPtr, this);
  }

  public boolean IsWedge() {
    return openbabelJNI.OBMolBondIter_IsWedge(swigCPtr, this);
  }

  public boolean IsHash() {
    return openbabelJNI.OBMolBondIter_IsHash(swigCPtr, this);
  }

  public boolean IsDoubleBondGeometry() {
    return openbabelJNI.OBMolBondIter_IsDoubleBondGeometry(swigCPtr, this);
  }

  public boolean Clear() {
    return openbabelJNI.OBMolBondIter_Clear(swigCPtr, this);
  }

  public OBBase DoTransformations(SWIGTYPE_p_std__mapTstd__string_std__string_t arg0) {
    long cPtr = openbabelJNI.OBMolBondIter_DoTransformations(swigCPtr, this, SWIGTYPE_p_std__mapTstd__string_std__string_t.getCPtr(arg0));
    return (cPtr == 0) ? null : new OBBase(cPtr, false);
  }

  public String ClassDescription() {
    return openbabelJNI.OBMolBondIter_ClassDescription(swigCPtr, this);
  }

  public boolean HasData(long type) {
    return openbabelJNI.OBMolBondIter_HasData__SWIG_2(swigCPtr, this, type);
  }

  public void DeleteData(long type) {
    openbabelJNI.OBMolBondIter_DeleteData__SWIG_0(swigCPtr, this, type);
  }

  public void DeleteData(OBGenericData arg0) {
    openbabelJNI.OBMolBondIter_DeleteData__SWIG_1(swigCPtr, this, OBGenericData.getCPtr(arg0), arg0);
  }

  public void DeleteData(vectorData arg0) {
    openbabelJNI.OBMolBondIter_DeleteData__SWIG_2(swigCPtr, this, vectorData.getCPtr(arg0), arg0);
  }

  public boolean DeleteData(String s) {
    return openbabelJNI.OBMolBondIter_DeleteData__SWIG_3(swigCPtr, this, s);
  }

  public void SetData(OBGenericData d) {
    openbabelJNI.OBMolBondIter_SetData(swigCPtr, this, OBGenericData.getCPtr(d), d);
  }

  public long DataSize() {
    return openbabelJNI.OBMolBondIter_DataSize(swigCPtr, this);
  }

  public OBGenericData GetData(long type) {
    long cPtr = openbabelJNI.OBMolBondIter_GetData__SWIG_0(swigCPtr, this, type);
    return (cPtr == 0) ? null : new OBGenericData(cPtr, false);
  }

  public vectorData GetData() {
    return new vectorData(openbabelJNI.OBMolBondIter_GetData__SWIG_3(swigCPtr, this), false);
  }

  public vectorData GetData(DataOrigin source) {
    return new vectorData(openbabelJNI.OBMolBondIter_GetData__SWIG_4(swigCPtr, this, source.swigValue()), true);
  }

  public SWIGTYPE_p_std__vectorTOpenBabel__OBGenericData_p_t__iterator BeginData() {
    return new SWIGTYPE_p_std__vectorTOpenBabel__OBGenericData_p_t__iterator(openbabelJNI.OBMolBondIter_BeginData(swigCPtr, this), true);
  }

  public SWIGTYPE_p_std__vectorTOpenBabel__OBGenericData_p_t__iterator EndData() {
    return new SWIGTYPE_p_std__vectorTOpenBabel__OBGenericData_p_t__iterator(openbabelJNI.OBMolBondIter_EndData(swigCPtr, this), true);
  }

}