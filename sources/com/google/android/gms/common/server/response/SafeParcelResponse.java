package com.google.android.gms.common.server.response;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.data.a;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.JsonUtils;
import com.google.android.gms.common.util.MapUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import v.e;

/* JADX INFO: loaded from: classes.dex */
@VisibleForTesting
@KeepForSdk
@SafeParcelable.Class(creator = "SafeParcelResponseCreator")
public class SafeParcelResponse extends FastSafeParcelableJsonResponse {

    @KeepForSdk
    public static final Parcelable.Creator<SafeParcelResponse> CREATOR = new zaq();

    @SafeParcelable.VersionField(getter = "getVersionCode", id = 1)
    private final int zaa;

    @SafeParcelable.Field(getter = "getParcel", id = 2)
    private final Parcel zab;
    private final int zac;

    @SafeParcelable.Field(getter = "getFieldMappingDictionary", id = 3)
    private final zan zad;
    private final String zae;
    private int zaf;
    private int zag;

    @SafeParcelable.Constructor
    public SafeParcelResponse(@SafeParcelable.Param(id = 1) int i10, @SafeParcelable.Param(id = 2) Parcel parcel, @SafeParcelable.Param(id = 3) zan zanVar) {
        this.zaa = i10;
        this.zab = (Parcel) Preconditions.checkNotNull(parcel);
        this.zac = 2;
        this.zad = zanVar;
        this.zae = zanVar == null ? null : zanVar.zaa();
        this.zaf = 2;
    }

    private SafeParcelResponse(SafeParcelable safeParcelable, zan zanVar, String str) {
        this.zaa = 1;
        Parcel parcelObtain = Parcel.obtain();
        this.zab = parcelObtain;
        safeParcelable.writeToParcel(parcelObtain, 0);
        this.zac = 1;
        this.zad = (zan) Preconditions.checkNotNull(zanVar);
        this.zae = (String) Preconditions.checkNotNull(str);
        this.zaf = 2;
    }

    public SafeParcelResponse(zan zanVar, String str) {
        this.zaa = 1;
        this.zab = Parcel.obtain();
        this.zac = 0;
        this.zad = (zan) Preconditions.checkNotNull(zanVar);
        this.zae = (String) Preconditions.checkNotNull(str);
        this.zaf = 0;
    }

    @KeepForSdk
    public static <T extends FastJsonResponse & SafeParcelable> SafeParcelResponse from(T t10) {
        String str = (String) Preconditions.checkNotNull(t10.getClass().getCanonicalName());
        zan zanVar = new zan(t10.getClass());
        zaF(zanVar, t10);
        zanVar.zac();
        zanVar.zad();
        return new SafeParcelResponse(t10, zanVar, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void zaF(zan zanVar, FastJsonResponse fastJsonResponse) {
        Class<?> cls = fastJsonResponse.getClass();
        if (zanVar.zaf(cls)) {
            return;
        }
        Map<String, FastJsonResponse.Field<?, ?>> fieldMappings = fastJsonResponse.getFieldMappings();
        zanVar.zae(cls, fieldMappings);
        Iterator<String> it = fieldMappings.keySet().iterator();
        while (it.hasNext()) {
            FastJsonResponse.Field<?, ?> field = fieldMappings.get(it.next());
            Class<? extends FastJsonResponse> cls2 = field.zag;
            if (cls2 != null) {
                try {
                    zaF(zanVar, cls2.newInstance());
                } catch (IllegalAccessException e10) {
                    String strValueOf = String.valueOf(((Class) Preconditions.checkNotNull(field.zag)).getCanonicalName());
                    throw new IllegalStateException(strValueOf.length() != 0 ? "Could not access object of type ".concat(strValueOf) : new String("Could not access object of type "), e10);
                } catch (InstantiationException e11) {
                    String strValueOf2 = String.valueOf(((Class) Preconditions.checkNotNull(field.zag)).getCanonicalName());
                    throw new IllegalStateException(strValueOf2.length() != 0 ? "Could not instantiate an object of type ".concat(strValueOf2) : new String("Could not instantiate an object of type "), e11);
                }
            }
        }
    }

    private final void zaG(FastJsonResponse.Field<?, ?> field) {
        if (field.zaf == -1) {
            throw new IllegalStateException("Field does not have a valid safe parcelable field id.");
        }
        Parcel parcel = this.zab;
        if (parcel == null) {
            throw new IllegalStateException("Internal Parcel object is null.");
        }
        int i10 = this.zaf;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("Attempted to parse JSON with a SafeParcelResponse object that is already filled with data.");
            }
        } else {
            this.zag = SafeParcelWriter.beginObjectHeader(parcel);
            this.zaf = 1;
        }
    }

    private final void zaH(StringBuilder sb2, Map<String, FastJsonResponse.Field<?, ?>> map, Parcel parcel) {
        Object objCreateBigInteger;
        String strEscapeString;
        String str;
        Object objValueOf;
        Object objZaD;
        SparseArray sparseArray = new SparseArray();
        for (Map.Entry<String, FastJsonResponse.Field<?, ?>> entry : map.entrySet()) {
            sparseArray.put(entry.getValue().getSafeParcelableFieldId(), entry);
        }
        sb2.append('{');
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        boolean z10 = false;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            Map.Entry entry2 = (Map.Entry) sparseArray.get(SafeParcelReader.getFieldId(header));
            if (entry2 != null) {
                if (z10) {
                    sb2.append(",");
                }
                String str2 = (String) entry2.getKey();
                FastJsonResponse.Field field = (FastJsonResponse.Field) entry2.getValue();
                sb2.append("\"");
                sb2.append(str2);
                sb2.append("\":");
                if (field.zaj()) {
                    int i10 = field.zac;
                    switch (i10) {
                        case 0:
                            objValueOf = Integer.valueOf(SafeParcelReader.readInt(parcel, header));
                            objZaD = FastJsonResponse.zaD(field, objValueOf);
                            zaJ(sb2, field, objZaD);
                            break;
                        case 1:
                            objValueOf = SafeParcelReader.createBigInteger(parcel, header);
                            objZaD = FastJsonResponse.zaD(field, objValueOf);
                            zaJ(sb2, field, objZaD);
                            break;
                        case 2:
                            objValueOf = Long.valueOf(SafeParcelReader.readLong(parcel, header));
                            objZaD = FastJsonResponse.zaD(field, objValueOf);
                            zaJ(sb2, field, objZaD);
                            break;
                        case 3:
                            objValueOf = Float.valueOf(SafeParcelReader.readFloat(parcel, header));
                            objZaD = FastJsonResponse.zaD(field, objValueOf);
                            zaJ(sb2, field, objZaD);
                            break;
                        case 4:
                            objValueOf = Double.valueOf(SafeParcelReader.readDouble(parcel, header));
                            objZaD = FastJsonResponse.zaD(field, objValueOf);
                            zaJ(sb2, field, objZaD);
                            break;
                        case 5:
                            objValueOf = SafeParcelReader.createBigDecimal(parcel, header);
                            objZaD = FastJsonResponse.zaD(field, objValueOf);
                            zaJ(sb2, field, objZaD);
                            break;
                        case 6:
                            objValueOf = Boolean.valueOf(SafeParcelReader.readBoolean(parcel, header));
                            objZaD = FastJsonResponse.zaD(field, objValueOf);
                            zaJ(sb2, field, objZaD);
                            break;
                        case 7:
                            objValueOf = SafeParcelReader.createString(parcel, header);
                            objZaD = FastJsonResponse.zaD(field, objValueOf);
                            zaJ(sb2, field, objZaD);
                            break;
                        case 8:
                        case 9:
                            objZaD = FastJsonResponse.zaD(field, SafeParcelReader.createByteArray(parcel, header));
                            zaJ(sb2, field, objZaD);
                            break;
                        case 10:
                            Bundle bundleCreateBundle = SafeParcelReader.createBundle(parcel, header);
                            HashMap map2 = new HashMap();
                            for (String str3 : bundleCreateBundle.keySet()) {
                                map2.put(str3, (String) Preconditions.checkNotNull(bundleCreateBundle.getString(str3)));
                            }
                            objZaD = FastJsonResponse.zaD(field, map2);
                            zaJ(sb2, field, objZaD);
                            break;
                        case 11:
                            throw new IllegalArgumentException("Method does not accept concrete type.");
                        default:
                            throw new IllegalArgumentException(a.a(36, "Unknown field out type = ", i10));
                    }
                } else {
                    if (field.zad) {
                        sb2.append("[");
                        switch (field.zac) {
                            case 0:
                                ArrayUtils.writeArray(sb2, SafeParcelReader.createIntArray(parcel, header));
                                break;
                            case 1:
                                ArrayUtils.writeArray(sb2, SafeParcelReader.createBigIntegerArray(parcel, header));
                                break;
                            case 2:
                                ArrayUtils.writeArray(sb2, SafeParcelReader.createLongArray(parcel, header));
                                break;
                            case 3:
                                ArrayUtils.writeArray(sb2, SafeParcelReader.createFloatArray(parcel, header));
                                break;
                            case 4:
                                ArrayUtils.writeArray(sb2, SafeParcelReader.createDoubleArray(parcel, header));
                                break;
                            case 5:
                                ArrayUtils.writeArray(sb2, SafeParcelReader.createBigDecimalArray(parcel, header));
                                break;
                            case 6:
                                ArrayUtils.writeArray(sb2, SafeParcelReader.createBooleanArray(parcel, header));
                                break;
                            case 7:
                                ArrayUtils.writeStringArray(sb2, SafeParcelReader.createStringArray(parcel, header));
                                break;
                            case 8:
                            case 9:
                            case 10:
                                throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                            case 11:
                                Parcel[] parcelArrCreateParcelArray = SafeParcelReader.createParcelArray(parcel, header);
                                int length = parcelArrCreateParcelArray.length;
                                for (int i11 = 0; i11 < length; i11++) {
                                    if (i11 > 0) {
                                        sb2.append(",");
                                    }
                                    parcelArrCreateParcelArray[i11].setDataPosition(0);
                                    zaH(sb2, field.zah(), parcelArrCreateParcelArray[i11]);
                                }
                                break;
                            default:
                                throw new IllegalStateException("Unknown field type out.");
                        }
                        str = "]";
                    } else {
                        switch (field.zac) {
                            case 0:
                                sb2.append(SafeParcelReader.readInt(parcel, header));
                                break;
                            case 1:
                                objCreateBigInteger = SafeParcelReader.createBigInteger(parcel, header);
                                sb2.append(objCreateBigInteger);
                                break;
                            case 2:
                                sb2.append(SafeParcelReader.readLong(parcel, header));
                                break;
                            case 3:
                                sb2.append(SafeParcelReader.readFloat(parcel, header));
                                break;
                            case 4:
                                sb2.append(SafeParcelReader.readDouble(parcel, header));
                                break;
                            case 5:
                                objCreateBigInteger = SafeParcelReader.createBigDecimal(parcel, header);
                                sb2.append(objCreateBigInteger);
                                break;
                            case 6:
                                sb2.append(SafeParcelReader.readBoolean(parcel, header));
                                break;
                            case 7:
                                String strCreateString = SafeParcelReader.createString(parcel, header);
                                sb2.append("\"");
                                strEscapeString = JsonUtils.escapeString(strCreateString);
                                sb2.append(strEscapeString);
                                sb2.append("\"");
                                break;
                            case 8:
                                byte[] bArrCreateByteArray = SafeParcelReader.createByteArray(parcel, header);
                                sb2.append("\"");
                                strEscapeString = Base64Utils.encode(bArrCreateByteArray);
                                sb2.append(strEscapeString);
                                sb2.append("\"");
                                break;
                            case 9:
                                byte[] bArrCreateByteArray2 = SafeParcelReader.createByteArray(parcel, header);
                                sb2.append("\"");
                                strEscapeString = Base64Utils.encodeUrlSafe(bArrCreateByteArray2);
                                sb2.append(strEscapeString);
                                sb2.append("\"");
                                break;
                            case 10:
                                Bundle bundleCreateBundle2 = SafeParcelReader.createBundle(parcel, header);
                                Set<String> setKeySet = bundleCreateBundle2.keySet();
                                sb2.append("{");
                                boolean z11 = true;
                                for (String str4 : setKeySet) {
                                    if (!z11) {
                                        sb2.append(",");
                                    }
                                    e.a(sb2, "\"", str4, "\":\"");
                                    sb2.append(JsonUtils.escapeString(bundleCreateBundle2.getString(str4)));
                                    sb2.append("\"");
                                    z11 = false;
                                }
                                str = "}";
                                break;
                            case 11:
                                Parcel parcelCreateParcel = SafeParcelReader.createParcel(parcel, header);
                                parcelCreateParcel.setDataPosition(0);
                                zaH(sb2, field.zah(), parcelCreateParcel);
                                break;
                            default:
                                throw new IllegalStateException("Unknown field type out");
                        }
                    }
                    sb2.append(str);
                }
                z10 = true;
            }
        }
        if (parcel.dataPosition() != iValidateObjectHeader) {
            throw new SafeParcelReader.ParseException(a.a(37, "Overread allowed size end=", iValidateObjectHeader), parcel);
        }
        sb2.append('}');
    }

    private static final void zaI(StringBuilder sb2, int i10, Object obj) {
        switch (i10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb2.append(obj);
                return;
            case 7:
                sb2.append("\"");
                sb2.append(JsonUtils.escapeString(Preconditions.checkNotNull(obj).toString()));
                sb2.append("\"");
                return;
            case 8:
                sb2.append("\"");
                sb2.append(Base64Utils.encode((byte[]) obj));
                sb2.append("\"");
                return;
            case 9:
                sb2.append("\"");
                sb2.append(Base64Utils.encodeUrlSafe((byte[]) obj));
                sb2.append("\"");
                return;
            case 10:
                MapUtils.writeStringMapToJson(sb2, (HashMap) Preconditions.checkNotNull(obj));
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                throw new IllegalArgumentException(a.a(26, "Unknown type = ", i10));
        }
    }

    private static final void zaJ(StringBuilder sb2, FastJsonResponse.Field<?, ?> field, Object obj) {
        if (!field.zab) {
            zaI(sb2, field.zaa, obj);
            return;
        }
        ArrayList arrayList = (ArrayList) obj;
        sb2.append("[");
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (i10 != 0) {
                sb2.append(",");
            }
            zaI(sb2, field.zaa, arrayList.get(i10));
        }
        sb2.append("]");
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final <T extends FastJsonResponse> void addConcreteTypeArrayInternal(FastJsonResponse.Field field, String str, ArrayList<T> arrayList) {
        zaG((FastJsonResponse.Field<?, ?>) field);
        ArrayList arrayList2 = new ArrayList();
        ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList2.add(((SafeParcelResponse) arrayList.get(i10)).zaE());
        }
        SafeParcelWriter.writeParcelList(this.zab, field.getSafeParcelableFieldId(), arrayList2, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final <T extends FastJsonResponse> void addConcreteTypeInternal(FastJsonResponse.Field field, String str, T t10) {
        zaG((FastJsonResponse.Field<?, ?>) field);
        SafeParcelWriter.writeParcel(this.zab, field.getSafeParcelableFieldId(), ((SafeParcelResponse) t10).zaE(), true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final Map<String, FastJsonResponse.Field<?, ?>> getFieldMappings() {
        zan zanVar = this.zad;
        if (zanVar == null) {
            return null;
        }
        return zanVar.zab((String) Preconditions.checkNotNull(this.zae));
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse, com.google.android.gms.common.server.response.FastJsonResponse
    public final Object getValueObject(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse, com.google.android.gms.common.server.response.FastJsonResponse
    public final boolean isPrimitiveFieldSet(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void setBooleanInternal(FastJsonResponse.Field<?, ?> field, String str, boolean z10) {
        zaG(field);
        SafeParcelWriter.writeBoolean(this.zab, field.getSafeParcelableFieldId(), z10);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void setDecodedBytesInternal(FastJsonResponse.Field<?, ?> field, String str, byte[] bArr) {
        zaG(field);
        SafeParcelWriter.writeByteArray(this.zab, field.getSafeParcelableFieldId(), bArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void setIntegerInternal(FastJsonResponse.Field<?, ?> field, String str, int i10) {
        zaG(field);
        SafeParcelWriter.writeInt(this.zab, field.getSafeParcelableFieldId(), i10);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void setLongInternal(FastJsonResponse.Field<?, ?> field, String str, long j10) {
        zaG(field);
        SafeParcelWriter.writeLong(this.zab, field.getSafeParcelableFieldId(), j10);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void setStringInternal(FastJsonResponse.Field<?, ?> field, String str, String str2) {
        zaG(field);
        SafeParcelWriter.writeString(this.zab, field.getSafeParcelableFieldId(), str2, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void setStringMapInternal(FastJsonResponse.Field<?, ?> field, String str, Map<String, String> map) {
        zaG(field);
        Bundle bundle = new Bundle();
        for (String str2 : ((Map) Preconditions.checkNotNull(map)).keySet()) {
            bundle.putString(str2, map.get(str2));
        }
        SafeParcelWriter.writeBundle(this.zab, field.getSafeParcelableFieldId(), bundle, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void setStringsInternal(FastJsonResponse.Field<?, ?> field, String str, ArrayList<String> arrayList) {
        zaG(field);
        int size = ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
        String[] strArr = new String[size];
        for (int i10 = 0; i10 < size; i10++) {
            strArr[i10] = arrayList.get(i10);
        }
        SafeParcelWriter.writeStringArray(this.zab, field.getSafeParcelableFieldId(), strArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final String toString() {
        Preconditions.checkNotNull(this.zad, "Cannot convert to JSON on client side.");
        Parcel parcelZaE = zaE();
        parcelZaE.setDataPosition(0);
        StringBuilder sb2 = new StringBuilder(100);
        zaH(sb2, (Map) Preconditions.checkNotNull(this.zad.zab((String) Preconditions.checkNotNull(this.zae))), parcelZaE);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zaa);
        SafeParcelWriter.writeParcel(parcel, 2, zaE(), false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zac != 0 ? this.zad : null, i10, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final Parcel zaE() {
        int i10 = this.zaf;
        if (i10 != 0) {
            if (i10 == 1) {
                SafeParcelWriter.finishObjectHeader(this.zab, this.zag);
            }
            return this.zab;
        }
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(this.zab);
        this.zag = iBeginObjectHeader;
        SafeParcelWriter.finishObjectHeader(this.zab, iBeginObjectHeader);
        this.zaf = 2;
        return this.zab;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zab(FastJsonResponse.Field<?, ?> field, String str, BigDecimal bigDecimal) {
        zaG(field);
        SafeParcelWriter.writeBigDecimal(this.zab, field.getSafeParcelableFieldId(), bigDecimal, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zad(FastJsonResponse.Field<?, ?> field, String str, ArrayList<BigDecimal> arrayList) {
        zaG(field);
        int size = ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
        BigDecimal[] bigDecimalArr = new BigDecimal[size];
        for (int i10 = 0; i10 < size; i10++) {
            bigDecimalArr[i10] = arrayList.get(i10);
        }
        SafeParcelWriter.writeBigDecimalArray(this.zab, field.getSafeParcelableFieldId(), bigDecimalArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zaf(FastJsonResponse.Field<?, ?> field, String str, BigInteger bigInteger) {
        zaG(field);
        SafeParcelWriter.writeBigInteger(this.zab, field.getSafeParcelableFieldId(), bigInteger, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zah(FastJsonResponse.Field<?, ?> field, String str, ArrayList<BigInteger> arrayList) {
        zaG(field);
        int size = ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
        BigInteger[] bigIntegerArr = new BigInteger[size];
        for (int i10 = 0; i10 < size; i10++) {
            bigIntegerArr[i10] = arrayList.get(i10);
        }
        SafeParcelWriter.writeBigIntegerArray(this.zab, field.getSafeParcelableFieldId(), bigIntegerArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zak(FastJsonResponse.Field<?, ?> field, String str, ArrayList<Boolean> arrayList) {
        zaG(field);
        int size = ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
        boolean[] zArr = new boolean[size];
        for (int i10 = 0; i10 < size; i10++) {
            zArr[i10] = arrayList.get(i10).booleanValue();
        }
        SafeParcelWriter.writeBooleanArray(this.zab, field.getSafeParcelableFieldId(), zArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zan(FastJsonResponse.Field<?, ?> field, String str, double d10) {
        zaG(field);
        SafeParcelWriter.writeDouble(this.zab, field.getSafeParcelableFieldId(), d10);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zap(FastJsonResponse.Field<?, ?> field, String str, ArrayList<Double> arrayList) {
        zaG(field);
        int size = ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
        double[] dArr = new double[size];
        for (int i10 = 0; i10 < size; i10++) {
            dArr[i10] = arrayList.get(i10).doubleValue();
        }
        SafeParcelWriter.writeDoubleArray(this.zab, field.getSafeParcelableFieldId(), dArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zar(FastJsonResponse.Field<?, ?> field, String str, float f10) {
        zaG(field);
        SafeParcelWriter.writeFloat(this.zab, field.getSafeParcelableFieldId(), f10);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zat(FastJsonResponse.Field<?, ?> field, String str, ArrayList<Float> arrayList) {
        zaG(field);
        int size = ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
        float[] fArr = new float[size];
        for (int i10 = 0; i10 < size; i10++) {
            fArr[i10] = arrayList.get(i10).floatValue();
        }
        SafeParcelWriter.writeFloatArray(this.zab, field.getSafeParcelableFieldId(), fArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zaw(FastJsonResponse.Field<?, ?> field, String str, ArrayList<Integer> arrayList) {
        zaG(field);
        int size = ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
        int[] iArr = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = arrayList.get(i10).intValue();
        }
        SafeParcelWriter.writeIntArray(this.zab, field.getSafeParcelableFieldId(), iArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zaz(FastJsonResponse.Field<?, ?> field, String str, ArrayList<Long> arrayList) {
        zaG(field);
        int size = ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
        long[] jArr = new long[size];
        for (int i10 = 0; i10 < size; i10++) {
            jArr[i10] = arrayList.get(i10).longValue();
        }
        SafeParcelWriter.writeLongArray(this.zab, field.getSafeParcelableFieldId(), jArr, true);
    }
}
