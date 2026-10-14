package se;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import ne.r;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Externalizable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte f35506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f35507d;

    public a() {
    }

    public a(byte b10, Object obj) {
        this.f35506c = b10;
        this.f35507d = obj;
    }

    public static long a(DataInput dataInput) throws IOException {
        int i10 = dataInput.readByte() & 255;
        if (i10 == 255) {
            return dataInput.readLong();
        }
        return (((long) (((i10 << 16) + ((dataInput.readByte() & 255) << 8)) + (dataInput.readByte() & 255))) * 900) - 4575744000L;
    }

    public static Object b(byte b10, DataInput dataInput) throws IOException, ClassNotFoundException {
        if (b10 != 1) {
            if (b10 != 2) {
                if (b10 == 3) {
                    return e.a(dataInput);
                }
                throw new StreamCorruptedException("Unknown serialized type");
            }
            long jA = a(dataInput);
            r rVarC = c(dataInput);
            r rVarC2 = c(dataInput);
            if (rVarC.equals(rVarC2)) {
                throw new IllegalArgumentException("Offsets must not be equal");
            }
            return new d(jA, rVarC, rVarC2);
        }
        int i10 = dataInput.readInt();
        long[] jArr = new long[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            jArr[i11] = a(dataInput);
        }
        int i12 = i10 + 1;
        r[] rVarArr = new r[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            rVarArr[i13] = c(dataInput);
        }
        int i14 = dataInput.readInt();
        long[] jArr2 = new long[i14];
        for (int i15 = 0; i15 < i14; i15++) {
            jArr2[i15] = a(dataInput);
        }
        int i16 = i14 + 1;
        r[] rVarArr2 = new r[i16];
        for (int i17 = 0; i17 < i16; i17++) {
            rVarArr2[i17] = c(dataInput);
        }
        int i18 = dataInput.readByte();
        e[] eVarArr = new e[i18];
        for (int i19 = 0; i19 < i18; i19++) {
            eVarArr[i19] = e.a(dataInput);
        }
        return new b(jArr, rVarArr, jArr2, rVarArr2, eVarArr);
    }

    public static r c(DataInput dataInput) throws IOException {
        byte b10 = dataInput.readByte();
        return b10 == 127 ? r.n(dataInput.readInt()) : r.n(b10 * 900);
    }

    public static void d(long j10, DataOutput dataOutput) throws IOException {
        if (j10 < -4575744000L || j10 >= 10413792000L || j10 % 900 != 0) {
            dataOutput.writeByte(255);
            dataOutput.writeLong(j10);
        } else {
            int i10 = (int) ((j10 + 4575744000L) / 900);
            dataOutput.writeByte((i10 >>> 16) & 255);
            dataOutput.writeByte((i10 >>> 8) & 255);
            dataOutput.writeByte(i10 & 255);
        }
    }

    public static void e(r rVar, DataOutput dataOutput) throws IOException {
        int i10 = rVar.f33835d;
        int i11 = i10 % 900 == 0 ? i10 / 900 : 127;
        dataOutput.writeByte(i11);
        if (i11 == 127) {
            dataOutput.writeInt(i10);
        }
    }

    private Object readResolve() {
        return this.f35507d;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        byte b10 = objectInput.readByte();
        this.f35506c = b10;
        this.f35507d = b(b10, objectInput);
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b10 = this.f35506c;
        Object obj = this.f35507d;
        objectOutput.writeByte(b10);
        if (b10 != 1) {
            if (b10 != 2) {
                if (b10 != 3) {
                    throw new InvalidClassException("Unknown serialized type");
                }
                ((e) obj).b(objectOutput);
                return;
            } else {
                d dVar = (d) obj;
                d(dVar.f35522c.k(dVar.f35523d), objectOutput);
                e(dVar.f35523d, objectOutput);
                e(dVar.f35524e, objectOutput);
                return;
            }
        }
        b bVar = (b) obj;
        objectOutput.writeInt(bVar.f35508c.length);
        for (long j10 : bVar.f35508c) {
            d(j10, objectOutput);
        }
        for (r rVar : bVar.f35509d) {
            e(rVar, objectOutput);
        }
        objectOutput.writeInt(bVar.f35510e.length);
        for (long j11 : bVar.f35510e) {
            d(j11, objectOutput);
        }
        for (r rVar2 : bVar.f35512g) {
            e(rVar2, objectOutput);
        }
        objectOutput.writeByte(bVar.f35513h.length);
        for (e eVar : bVar.f35513h) {
            eVar.b(objectOutput);
        }
    }
}
