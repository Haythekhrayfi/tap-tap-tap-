package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfpu {
    private final zzfos zza;
    private final zzfpt zzb;

    private zzfpu(zzfpt zzfptVar) {
        zzfor zzforVar = zzfor.zza;
        this.zzb = zzfptVar;
        this.zza = zzforVar;
    }

    public static zzfpu zzb(int i10) {
        return new zzfpu(new zzfpq(4000));
    }

    public static zzfpu zzc(zzfos zzfosVar) {
        return new zzfpu(new zzfpo(zzfosVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Iterator zzg(CharSequence charSequence) {
        return this.zzb.zza(this, charSequence);
    }

    public final Iterable zzd(CharSequence charSequence) {
        Objects.requireNonNull(charSequence);
        return new zzfpr(this, charSequence);
    }

    public final List zzf(CharSequence charSequence) {
        Iterator itZzg = zzg(charSequence);
        ArrayList arrayList = new ArrayList();
        while (itZzg.hasNext()) {
            arrayList.add((String) itZzg.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
