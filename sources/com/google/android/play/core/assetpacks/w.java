package com.google.android.play.core.assetpacks;

import android.os.ParcelFileDescriptor;
import com.google.android.play.core.tasks.Task;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
interface w {
    Task<AssetPackStates> a(List<String> list, az azVar, Map<String, Long> map);

    Task<AssetPackStates> a(List<String> list, List<String> list2, Map<String, Long> map);

    Task<List<String>> a(Map<String, Long> map);

    void a();

    void a(int i10);

    void a(int i10, String str);

    void a(int i10, String str, String str2, int i11);

    void a(String str);

    void a(List<String> list);

    Task<ParcelFileDescriptor> b(int i10, String str, String str2, int i11);
}
