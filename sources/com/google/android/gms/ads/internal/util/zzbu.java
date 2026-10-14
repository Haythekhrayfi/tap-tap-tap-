package com.google.android.gms.ads.internal.util;

import android.os.Bundle;
import android.util.JsonReader;
import android.util.JsonToken;
import android.util.JsonWriter;
import com.google.android.gms.internal.ads.zzbzr;
import com.google.android.gms.internal.ads.zzezs;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzbu {
    public static final zzbt zza = new zzbs();

    public static Bundle zza(JSONObject jSONObject) {
        String strValueOf;
        String str;
        String strConcat;
        if (jSONObject == null) {
            return null;
        }
        Iterator<String> itKeys = jSONObject.keys();
        Bundle bundle = new Bundle();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = jSONObject.opt(next);
            if (objOpt != null) {
                if (objOpt instanceof Boolean) {
                    bundle.putBoolean(next, ((Boolean) objOpt).booleanValue());
                } else if (objOpt instanceof Double) {
                    bundle.putDouble(next, ((Double) objOpt).doubleValue());
                } else if (objOpt instanceof Integer) {
                    bundle.putInt(next, ((Integer) objOpt).intValue());
                } else if (objOpt instanceof Long) {
                    bundle.putLong(next, ((Long) objOpt).longValue());
                } else if (objOpt instanceof String) {
                    bundle.putString(next, (String) objOpt);
                } else if (objOpt instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) objOpt;
                    if (jSONArray.length() != 0) {
                        int length = jSONArray.length();
                        int i10 = 0;
                        Object objOpt2 = null;
                        for (int i11 = 0; objOpt2 == null && i11 < length; i11++) {
                            objOpt2 = !jSONArray.isNull(i11) ? jSONArray.opt(i11) : null;
                        }
                        if (objOpt2 == null) {
                            strValueOf = String.valueOf(next);
                            str = "Expected JSONArray with at least 1 non-null element for key:";
                            strConcat = str.concat(strValueOf);
                            zzbzr.zzj(strConcat);
                        } else if (objOpt2 instanceof JSONObject) {
                            Bundle[] bundleArr = new Bundle[length];
                            while (i10 < length) {
                                bundleArr[i10] = !jSONArray.isNull(i10) ? zza(jSONArray.optJSONObject(i10)) : null;
                                i10++;
                            }
                            bundle.putParcelableArray(next, bundleArr);
                        } else if (objOpt2 instanceof Number) {
                            double[] dArr = new double[jSONArray.length()];
                            while (i10 < length) {
                                dArr[i10] = jSONArray.optDouble(i10);
                                i10++;
                            }
                            bundle.putDoubleArray(next, dArr);
                        } else if (objOpt2 instanceof CharSequence) {
                            String[] strArr = new String[length];
                            while (i10 < length) {
                                strArr[i10] = !jSONArray.isNull(i10) ? jSONArray.optString(i10) : null;
                                i10++;
                            }
                            bundle.putStringArray(next, strArr);
                        } else if (objOpt2 instanceof Boolean) {
                            boolean[] zArr = new boolean[length];
                            while (i10 < length) {
                                zArr[i10] = jSONArray.optBoolean(i10);
                                i10++;
                            }
                            bundle.putBooleanArray(next, zArr);
                        } else {
                            strConcat = String.format("JSONArray with unsupported type %s for key:%s", objOpt2.getClass().getCanonicalName(), next);
                            zzbzr.zzj(strConcat);
                        }
                    }
                } else if (objOpt instanceof JSONObject) {
                    bundle.putBundle(next, zza((JSONObject) objOpt));
                } else {
                    strValueOf = String.valueOf(next);
                    str = "Unsupported type for key:";
                    strConcat = str.concat(strValueOf);
                    zzbzr.zzj(strConcat);
                }
            }
        }
        return bundle;
    }

    public static String zzb(String str, JSONObject jSONObject, String... strArr) {
        JSONObject jSONObjectZzm = zzm(jSONObject, strArr);
        return jSONObjectZzm == null ? "" : jSONObjectZzm.optString(strArr[0], "");
    }

    public static List zzc(JSONArray jSONArray, List list) throws JSONException {
        if (list == null) {
            list = new ArrayList();
        }
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                list.add(jSONArray.getString(i10));
            }
        }
        return list;
    }

    public static List zzd(JsonReader jsonReader) throws IllegalStateException, IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(jsonReader.nextString());
        }
        jsonReader.endArray();
        return arrayList;
    }

    public static JSONArray zze(JsonReader jsonReader) throws IllegalStateException, JSONException, IOException {
        Object objZze;
        JSONArray jSONArray = new JSONArray();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            JsonToken jsonTokenPeek = jsonReader.peek();
            if (JsonToken.BEGIN_ARRAY.equals(jsonTokenPeek)) {
                objZze = zze(jsonReader);
            } else if (JsonToken.BEGIN_OBJECT.equals(jsonTokenPeek)) {
                objZze = zzh(jsonReader);
            } else if (JsonToken.BOOLEAN.equals(jsonTokenPeek)) {
                jSONArray.put(jsonReader.nextBoolean());
            } else if (JsonToken.NUMBER.equals(jsonTokenPeek)) {
                jSONArray.put(jsonReader.nextDouble());
            } else {
                if (!JsonToken.STRING.equals(jsonTokenPeek)) {
                    throw new IllegalStateException("unexpected json token: ".concat(String.valueOf(jsonTokenPeek)));
                }
                objZze = jsonReader.nextString();
            }
            jSONArray.put(objZze);
        }
        jsonReader.endArray();
        return jSONArray;
    }

    public static JSONObject zzf(JSONObject jSONObject, String str) throws JSONException {
        try {
            return jSONObject.getJSONObject(str);
        } catch (JSONException unused) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject.put(str, jSONObject2);
            return jSONObject2;
        }
    }

    public static JSONObject zzg(JSONObject jSONObject, String... strArr) {
        JSONObject jSONObjectZzm = zzm(jSONObject, strArr);
        if (jSONObjectZzm == null) {
            return null;
        }
        return jSONObjectZzm.optJSONObject(strArr[1]);
    }

    public static JSONObject zzh(JsonReader jsonReader) throws IllegalStateException, JSONException, IOException {
        Object objZze;
        JSONObject jSONObject = new JSONObject();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            JsonToken jsonTokenPeek = jsonReader.peek();
            if (JsonToken.BEGIN_ARRAY.equals(jsonTokenPeek)) {
                objZze = zze(jsonReader);
            } else if (JsonToken.BEGIN_OBJECT.equals(jsonTokenPeek)) {
                objZze = zzh(jsonReader);
            } else if (JsonToken.BOOLEAN.equals(jsonTokenPeek)) {
                jSONObject.put(strNextName, jsonReader.nextBoolean());
            } else if (JsonToken.NUMBER.equals(jsonTokenPeek)) {
                jSONObject.put(strNextName, jsonReader.nextDouble());
            } else {
                if (!JsonToken.STRING.equals(jsonTokenPeek)) {
                    throw new IllegalStateException("unexpected json token: ".concat(String.valueOf(jsonTokenPeek)));
                }
                objZze = jsonReader.nextString();
            }
            jSONObject.put(strNextName, objZze);
        }
        jsonReader.endObject();
        return jSONObject;
    }

    public static void zzi(JsonWriter jsonWriter, JSONArray jSONArray) throws IOException {
        try {
            jsonWriter.beginArray();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                Object obj = jSONArray.get(i10);
                if (obj instanceof String) {
                    jsonWriter.value((String) obj);
                } else if (obj instanceof Number) {
                    jsonWriter.value((Number) obj);
                } else if (obj instanceof Boolean) {
                    jsonWriter.value(((Boolean) obj).booleanValue());
                } else if (obj instanceof JSONObject) {
                    zzj(jsonWriter, (JSONObject) obj);
                } else {
                    if (!(obj instanceof JSONArray)) {
                        throw new JSONException("unable to write field: " + String.valueOf(obj));
                    }
                    zzi(jsonWriter, (JSONArray) obj);
                }
            }
            jsonWriter.endArray();
        } catch (JSONException e10) {
            throw new IOException(e10);
        }
    }

    public static void zzj(JsonWriter jsonWriter, JSONObject jSONObject) throws IOException {
        try {
            jsonWriter.beginObject();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof String) {
                    jsonWriter.name(next).value((String) obj);
                } else if (obj instanceof Number) {
                    jsonWriter.name(next).value((Number) obj);
                } else if (obj instanceof Boolean) {
                    jsonWriter.name(next).value(((Boolean) obj).booleanValue());
                } else if (obj instanceof JSONObject) {
                    zzj(jsonWriter.name(next), (JSONObject) obj);
                } else {
                    if (!(obj instanceof JSONArray)) {
                        throw new JSONException("unable to write field: " + String.valueOf(obj));
                    }
                    zzi(jsonWriter.name(next), (JSONArray) obj);
                }
            }
            jsonWriter.endObject();
        } catch (JSONException e10) {
            throw new IOException(e10);
        }
    }

    public static boolean zzk(boolean z10, JSONObject jSONObject, String... strArr) {
        JSONObject jSONObjectZzm = zzm(jSONObject, strArr);
        if (jSONObjectZzm == null) {
            return false;
        }
        return jSONObjectZzm.optBoolean(strArr[strArr.length - 1], false);
    }

    public static String zzl(zzezs zzezsVar) {
        if (zzezsVar == null) {
            return null;
        }
        StringWriter stringWriter = new StringWriter();
        try {
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            zzn(jsonWriter, zzezsVar);
            jsonWriter.close();
            return stringWriter.toString();
        } catch (IOException e10) {
            zzbzr.zzh("Error when writing JSON.", e10);
            return null;
        }
    }

    private static JSONObject zzm(JSONObject jSONObject, String[] strArr) {
        for (int i10 = 0; i10 < strArr.length - 1; i10++) {
            if (jSONObject == null) {
                return null;
            }
            jSONObject = jSONObject.optJSONObject(strArr[i10]);
        }
        return jSONObject;
    }

    private static void zzn(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return;
        }
        if (obj instanceof Boolean) {
            jsonWriter.value(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof String) {
            jsonWriter.value((String) obj);
            return;
        }
        if (obj instanceof zzezs) {
            zzj(jsonWriter, ((zzezs) obj).zzd);
            return;
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginArray();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zzn(jsonWriter, it.next());
            }
            jsonWriter.endArray();
            return;
        }
        jsonWriter.beginObject();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            Object key = entry.getKey();
            if (key instanceof String) {
                zzn(jsonWriter.name((String) key), entry.getValue());
            }
        }
        jsonWriter.endObject();
    }
}
