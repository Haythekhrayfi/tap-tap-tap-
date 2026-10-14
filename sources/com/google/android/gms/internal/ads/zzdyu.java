package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdyu {
    public int zza = 0;
    public Map zzb = new HashMap();
    public String zzc = "";
    public long zzd = -1;

    public static zzdyu zza(Reader reader) throws zzezr {
        try {
            try {
                JsonReader jsonReader = new JsonReader(reader);
                HashMap map = new HashMap();
                long jNextLong = -1;
                String strNextString = "";
                jsonReader.beginObject();
                int iNextInt = 0;
                while (jsonReader.hasNext()) {
                    String strNextName = jsonReader.nextName();
                    if ("response".equals(strNextName)) {
                        iNextInt = jsonReader.nextInt();
                    } else if ("body".equals(strNextName)) {
                        strNextString = jsonReader.nextString();
                    } else if ("latency".equals(strNextName)) {
                        jNextLong = jsonReader.nextLong();
                    } else if ("headers".equals(strNextName)) {
                        map = new HashMap();
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            map.put(jsonReader.nextName(), com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader));
                        }
                        jsonReader.endObject();
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                zzdyu zzdyuVar = new zzdyu();
                zzdyuVar.zza = iNextInt;
                if (strNextString != null) {
                    zzdyuVar.zzc = strNextString;
                }
                zzdyuVar.zzd = jNextLong;
                zzdyuVar.zzb = map;
                IOUtils.closeQuietly(reader);
                return zzdyuVar;
            } catch (Throwable th) {
                IOUtils.closeQuietly(reader);
                throw th;
            }
        } catch (IOException | AssertionError | IllegalStateException | NumberFormatException e10) {
            throw new zzezr("Unable to parse Response", e10);
        }
    }
}
