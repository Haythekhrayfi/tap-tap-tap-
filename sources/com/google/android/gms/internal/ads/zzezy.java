package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzezy {
    public final List zza;
    public final zzezq zzb;
    public final List zzc;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public zzezy(JsonReader jsonReader) throws IllegalStateException, JSONException, IOException, NumberFormatException, AssertionError {
        ?? EmptyList = Collections.emptyList();
        ArrayList arrayList = new ArrayList();
        jsonReader.beginObject();
        zzezq zzezqVar = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if ("responses".equals(strNextName)) {
                jsonReader.beginArray();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    if ("ad_configs".equals(strNextName2)) {
                        EmptyList = new ArrayList();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            EmptyList.add(new zzezn(jsonReader));
                        }
                        jsonReader.endArray();
                    } else if (strNextName2.equals("common")) {
                        zzezqVar = new zzezq(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
            } else if (strNextName.equals("actions")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginObject();
                    String strNextString = null;
                    JSONObject jSONObjectZzh = null;
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        if ("name".equals(strNextName3)) {
                            strNextString = jsonReader.nextString();
                        } else if ("info".equals(strNextName3)) {
                            jSONObjectZzh = com.google.android.gms.ads.internal.util.zzbu.zzh(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    if (strNextString != null) {
                        arrayList.add(new zzezx(strNextString, jSONObjectZzh));
                    }
                    jsonReader.endObject();
                }
            }
            jsonReader.endArray();
        }
        this.zzc = arrayList;
        this.zza = EmptyList;
        this.zzb = zzezqVar == null ? new zzezq(new JsonReader(new StringReader("{}"))) : zzezqVar;
    }

    public static zzezy zza(Reader reader) throws zzezr {
        try {
            try {
                zzezy zzezyVar = new zzezy(new JsonReader(reader));
                IOUtils.closeQuietly(reader);
                return zzezyVar;
            } catch (Throwable th) {
                IOUtils.closeQuietly(reader);
                throw th;
            }
        } catch (IOException | AssertionError | IllegalStateException | NumberFormatException | JSONException e10) {
            throw new zzezr("unable to parse ServerResponse", e10);
        }
    }
}
