package ne;

import com.google.android.material.datepicker.UtcDates;
import fd.z;
import java.io.DataInput;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements Externalizable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte f33818c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f33819d;

    public n() {
    }

    public n(byte b10, Object obj) {
        this.f33818c = b10;
        this.f33819d = obj;
    }

    public static Object a(byte b10, DataInput dataInput) throws IOException {
        s sVar;
        s sVar2;
        if (b10 == 64) {
            int i10 = j.f33801e;
            return j.f(dataInput.readByte(), dataInput.readByte());
        }
        switch (b10) {
            case 1:
                d dVar = d.f33771e;
                return d.d(dataInput.readLong(), dataInput.readInt());
            case 2:
                e eVar = e.f33774e;
                return e.k(dataInput.readLong(), dataInput.readInt());
            case 3:
                f fVar = f.f33779f;
                return f.B(dataInput.readInt(), dataInput.readByte(), dataInput.readByte());
            case 4:
                return g.B(dataInput);
            case 5:
                return h.p(dataInput);
            case 6:
                g gVarB = g.B(dataInput);
                r rVarP = r.p(dataInput);
                q qVar = (q) a(dataInput.readByte(), dataInput);
                z.B(qVar, "zone");
                if (!(qVar instanceof r) || rVarP.equals(qVar)) {
                    return new t(gVarB, rVarP, qVar);
                }
                throw new IllegalArgumentException("ZoneId must match ZoneOffset");
            case 7:
                Pattern pattern = s.f33837f;
                String utf = dataInput.readUTF();
                if (utf.equals("Z") || utf.startsWith("+") || utf.startsWith("-")) {
                    throw new a(i.f.a("Invalid ID for region-based ZoneId, invalid format: ", utf));
                }
                if (utf.equals(UtcDates.UTC) || utf.equals("GMT") || utf.equals("UT")) {
                    return new s(utf, r.f33832h.h());
                }
                if (utf.startsWith("UTC+") || utf.startsWith("GMT+") || utf.startsWith("UTC-") || utf.startsWith("GMT-")) {
                    r rVarL = r.l(utf.substring(3));
                    if (rVarL.f33835d == 0) {
                        sVar = new s(utf.substring(0, 3), rVarL.h());
                    } else {
                        sVar = new s(utf.substring(0, 3) + rVarL.f33836e, rVarL.h());
                    }
                    return sVar;
                }
                if (!utf.startsWith("UT+") && !utf.startsWith("UT-")) {
                    return s.k(utf, false);
                }
                r rVarL2 = r.l(utf.substring(2));
                if (rVarL2.f33835d == 0) {
                    sVar2 = new s("UT", rVarL2.h());
                } else {
                    StringBuilder sbA = defpackage.a.a("UT");
                    sbA.append(rVarL2.f33836e);
                    sVar2 = new s(sbA.toString(), rVarL2.h());
                }
                return sVar2;
            case 8:
                return r.p(dataInput);
            default:
                switch (b10) {
                    case 66:
                        int i11 = l.f33809e;
                        return new l(h.p(dataInput), r.p(dataInput));
                    case 67:
                        int i12 = o.f33820d;
                        return o.g(dataInput.readInt());
                    case 68:
                        int i13 = p.f33824e;
                        int i14 = dataInput.readInt();
                        byte b11 = dataInput.readByte();
                        re.a.YEAR.checkValidValue(i14);
                        re.a.MONTH_OF_YEAR.checkValidValue(b11);
                        return new p(i14, b11);
                    case 69:
                        int i15 = k.f33805e;
                        return new k(g.B(dataInput), r.p(dataInput));
                    default:
                        throw new StreamCorruptedException("Unknown serialized type");
                }
        }
    }

    private Object readResolve() {
        return this.f33819d;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) throws IOException {
        byte b10 = objectInput.readByte();
        this.f33818c = b10;
        this.f33819d = a(b10, objectInput);
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b10 = this.f33818c;
        Object obj = this.f33819d;
        objectOutput.writeByte(b10);
        if (b10 == 64) {
            j jVar = (j) obj;
            objectOutput.writeByte(jVar.f33802c);
            objectOutput.writeByte(jVar.f33803d);
            return;
        }
        switch (b10) {
            case 1:
                d dVar = (d) obj;
                objectOutput.writeLong(dVar.f33772c);
                objectOutput.writeInt(dVar.f33773d);
                return;
            case 2:
                e eVar = (e) obj;
                objectOutput.writeLong(eVar.f33775c);
                objectOutput.writeInt(eVar.f33776d);
                return;
            case 3:
                f fVar = (f) obj;
                objectOutput.writeInt(fVar.f33781c);
                objectOutput.writeByte(fVar.f33782d);
                objectOutput.writeByte(fVar.f33783e);
                return;
            case 4:
                ((g) obj).F(objectOutput);
                return;
            case 5:
                ((h) obj).v(objectOutput);
                return;
            case 6:
                t tVar = (t) obj;
                tVar.f33840c.F(objectOutput);
                tVar.f33841d.q(objectOutput);
                tVar.f33842e.j(objectOutput);
                return;
            case 7:
                objectOutput.writeUTF(((s) obj).f33838d);
                return;
            case 8:
                ((r) obj).q(objectOutput);
                return;
            default:
                switch (b10) {
                    case 66:
                        l lVar = (l) obj;
                        lVar.f33810c.v(objectOutput);
                        lVar.f33811d.q(objectOutput);
                        return;
                    case 67:
                        objectOutput.writeInt(((o) obj).f33821c);
                        return;
                    case 68:
                        p pVar = (p) obj;
                        objectOutput.writeInt(pVar.f33825c);
                        objectOutput.writeByte(pVar.f33826d);
                        return;
                    case 69:
                        k kVar = (k) obj;
                        kVar.f33806c.F(objectOutput);
                        kVar.f33807d.q(objectOutput);
                        return;
                    default:
                        throw new InvalidClassException("Unknown serialized type");
                }
        }
    }
}
