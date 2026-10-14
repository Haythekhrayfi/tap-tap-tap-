package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfow {
    public static final CharSequence zza(@CheckForNull Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public static final StringBuilder zzb(StringBuilder sb2, Iterable iterable, String str) {
        Iterator it = iterable.iterator();
        try {
            if (it.hasNext()) {
                CharSequence charSequenceZza = zza(it.next());
                while (true) {
                    sb2.append(charSequenceZza);
                    if (!it.hasNext()) {
                        break;
                    }
                    sb2.append((CharSequence) str);
                    charSequenceZza = zza(it.next());
                }
            }
            return sb2;
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
