package com.google.android.gms.internal.measurement;

import androidx.activity.j;
import com.google.android.gms.internal.measurement.zzim;
import com.google.android.gms.internal.measurement.zzin;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzin<MessageType extends zzin<MessageType, BuilderType>, BuilderType extends zzim<MessageType, BuilderType>> implements zzll {
    public int zzb = 0;

    public static void zzbt(Iterable iterable, List list) {
        zzkm.zze(iterable);
        if (iterable instanceof zzkt) {
            List listZzh = ((zzkt) iterable).zzh();
            zzkt zzktVar = (zzkt) list;
            int size = list.size();
            for (Object obj : listZzh) {
                if (obj == null) {
                    int size2 = zzktVar.size();
                    StringBuilder sbA = defpackage.a.a("Element at index ");
                    sbA.append(size2 - size);
                    sbA.append(" is null.");
                    String string = sbA.toString();
                    int size3 = zzktVar.size();
                    while (true) {
                        size3--;
                        if (size3 < size) {
                            throw new NullPointerException(string);
                        }
                        zzktVar.remove(size3);
                    }
                } else if (obj instanceof zzjd) {
                    zzktVar.zzi((zzjd) obj);
                } else {
                    zzktVar.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof zzls) {
            list.addAll((Collection) iterable);
            return;
        }
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
        }
        int size4 = list.size();
        for (Object obj2 : iterable) {
            if (obj2 == null) {
                int size5 = list.size();
                StringBuilder sbA2 = defpackage.a.a("Element at index ");
                sbA2.append(size5 - size4);
                sbA2.append(" is null.");
                String string2 = sbA2.toString();
                int size6 = list.size();
                while (true) {
                    size6--;
                    if (size6 < size4) {
                        throw new NullPointerException(string2);
                    }
                    list.remove(size6);
                }
            } else {
                list.add(obj2);
            }
        }
    }

    public int zzbr() {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final zzjd zzbs() {
        try {
            int iZzbw = zzbw();
            zzjd zzjdVar = zzjd.zzb;
            byte[] bArr = new byte[iZzbw];
            zzjl zzjlVarZzC = zzjl.zzC(bArr);
            zzbK(zzjlVarZzC);
            zzjlVarZzC.zzD();
            return new zzja(bArr);
        } catch (IOException e10) {
            throw new RuntimeException(j.a("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e10);
        }
    }

    public void zzbu(int i10) {
        throw null;
    }

    public final byte[] zzbv() {
        try {
            byte[] bArr = new byte[zzbw()];
            zzjl zzjlVarZzC = zzjl.zzC(bArr);
            zzbK(zzjlVarZzC);
            zzjlVarZzC.zzD();
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException(j.a("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e10);
        }
    }
}
