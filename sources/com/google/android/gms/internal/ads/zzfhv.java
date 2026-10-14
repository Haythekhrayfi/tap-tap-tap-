package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfhv implements zzfht {
    private final zzfht zza;

    public zzfhv(zzfht zzfhtVar) {
        this.zza = zzfhtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfht
    public final JSONObject zza(View view) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzfht
    public final void zzb(View view, JSONObject jSONObject, zzfhs zzfhsVar, boolean z10, boolean z11) {
        ArrayList arrayList = new ArrayList();
        zzfhl zzfhlVarZza = zzfhl.zza();
        if (zzfhlVarZza != null) {
            Collection collectionZzb = zzfhlVarZza.zzb();
            int size = collectionZzb.size();
            IdentityHashMap identityHashMap = new IdentityHashMap(size + size + 3);
            Iterator it = collectionZzb.iterator();
            while (it.hasNext()) {
                View viewZzf = ((zzfha) it.next()).zzf();
                if (viewZzf != null && viewZzf.isAttachedToWindow() && viewZzf.isShown()) {
                    View view2 = viewZzf;
                    while (true) {
                        if (view2 == null) {
                            View rootView = viewZzf.getRootView();
                            if (rootView != null && !identityHashMap.containsKey(rootView)) {
                                identityHashMap.put(rootView, rootView);
                                float fZza = zzfie.zza(rootView);
                                int size2 = arrayList.size();
                                while (size2 > 0) {
                                    int i10 = size2 - 1;
                                    if (zzfie.zza((View) arrayList.get(i10)) <= fZza) {
                                        break;
                                    } else {
                                        size2 = i10;
                                    }
                                }
                                arrayList.add(size2, rootView);
                                break;
                            }
                            break;
                        }
                        if (view2.getAlpha() == StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                            break;
                        }
                        Object parent = view2.getParent();
                        view2 = parent instanceof View ? (View) parent : null;
                    }
                }
            }
        }
        int size3 = arrayList.size();
        for (int i11 = 0; i11 < size3; i11++) {
            zzfhsVar.zza((View) arrayList.get(i11), this.zza, jSONObject, z11);
        }
    }
}
