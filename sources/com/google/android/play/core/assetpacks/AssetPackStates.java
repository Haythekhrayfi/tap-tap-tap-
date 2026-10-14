package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AssetPackStates {
    public static AssetPackStates a(long j10, Map<String, AssetPackState> map) {
        return new bi(j10, map);
    }

    public static AssetPackStates a(Bundle bundle, bz bzVar) {
        return a(bundle, bzVar, new ArrayList());
    }

    public static AssetPackStates a(Bundle bundle, bz bzVar, az azVar) {
        return a(bundle, bzVar, new ArrayList(), azVar);
    }

    public static AssetPackStates a(Bundle bundle, bz bzVar, List<String> list) {
        return a(bundle, bzVar, list, ba.f11907a);
    }

    private static AssetPackStates a(Bundle bundle, bz bzVar, List<String> list, az azVar) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
        HashMap map = new HashMap();
        int size = stringArrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            String str = stringArrayList.get(i10);
            map.put(str, AssetPackState.a(bundle, str, bzVar, azVar));
        }
        int size2 = list.size();
        for (int i11 = 0; i11 < size2; i11++) {
            String str2 = list.get(i11);
            map.put(str2, AssetPackState.a(str2, 4, 0, 0L, 0L, 0.0d));
        }
        return a(bundle.getLong("total_bytes_to_download"), map);
    }

    public abstract Map<String, AssetPackState> packStates();

    public abstract long totalBytes();
}
