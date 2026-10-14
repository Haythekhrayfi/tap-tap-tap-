package com.google.android.gms.internal.ads;

import android.support.v4.media.j;
import com.google.android.gms.internal.ads.zzgnm;
import com.google.android.gms.internal.ads.zzgnn;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzgnn<MessageType extends zzgnn<MessageType, BuilderType>, BuilderType extends zzgnm<MessageType, BuilderType>> implements zzgqw {
    public int zza = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static void zzav(Iterable iterable, List list) {
        byte[] bArr = zzgpw.zzd;
        Objects.requireNonNull(iterable);
        if (iterable instanceof zzgqe) {
            List listZzh = ((zzgqe) iterable).zzh();
            zzgqe zzgqeVar = (zzgqe) list;
            int size = list.size();
            for (Object obj : listZzh) {
                if (obj == null) {
                    String strA = j.a("Element at index ", zzgqeVar.size() - size, " is null.");
                    int size2 = zzgqeVar.size();
                    while (true) {
                        size2--;
                        if (size2 < size) {
                            throw new NullPointerException(strA);
                        }
                        zzgqeVar.remove(size2);
                    }
                } else if (obj instanceof zzgoe) {
                    zzgqeVar.zzi((zzgoe) obj);
                } else {
                    zzgqeVar.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof zzgrd) {
            list.addAll(iterable);
            return;
        }
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(iterable.size() + list.size());
        }
        int size3 = list.size();
        for (Object obj2 : iterable) {
            if (obj2 == null) {
                String strA2 = j.a("Element at index ", list.size() - size3, " is null.");
                int size4 = list.size();
                while (true) {
                    size4--;
                    if (size4 < size3) {
                        throw new NullPointerException(strA2);
                    }
                    list.remove(size4);
                }
            } else {
                list.add(obj2);
            }
        }
    }

    public int zzat(zzgrp zzgrpVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgqw
    public final zzgoe zzau() {
        try {
            int iZzaz = zzaz();
            zzgoe zzgoeVar = zzgoe.zzb;
            byte[] bArr = new byte[iZzaz];
            zzgot zzgotVarZzC = zzgot.zzC(bArr, 0, iZzaz);
            zzaW(zzgotVarZzC);
            zzgotVarZzC.zzD();
            return new zzgoa(bArr);
        } catch (IOException e10) {
            throw new RuntimeException(androidx.activity.j.a("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e10);
        }
    }

    public final void zzaw(OutputStream outputStream) throws IOException {
        int iZzaz = zzaz();
        int i10 = zzgot.zzf;
        if (iZzaz > 4096) {
            iZzaz = 4096;
        }
        zzgor zzgorVar = new zzgor(outputStream, iZzaz);
        zzaW(zzgorVar);
        zzgorVar.zzI();
    }

    @Override // com.google.android.gms.internal.ads.zzgqw
    public final byte[] zzax() {
        try {
            int iZzaz = zzaz();
            byte[] bArr = new byte[iZzaz];
            zzgot zzgotVarZzC = zzgot.zzC(bArr, 0, iZzaz);
            zzaW(zzgotVarZzC);
            zzgotVarZzC.zzD();
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException(androidx.activity.j.a("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e10);
        }
    }
}
