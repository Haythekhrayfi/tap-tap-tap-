package oe;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import java.util.Objects;
import java.util.ServiceLoader;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class u implements Externalizable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte f34290c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f34291d;

    public u() {
    }

    public u(byte b10, Object obj) {
        this.f34290c = b10;
        this.f34291d = obj;
    }

    private Object readResolve() {
        return this.f34291d;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        Object pVar;
        Object objH;
        byte b10 = objectInput.readByte();
        this.f34290c = b10;
        switch (b10) {
            case 1:
                ne.f fVar = p.f34276f;
                int i10 = objectInput.readInt();
                byte b11 = objectInput.readByte();
                byte b12 = objectInput.readByte();
                Objects.requireNonNull(o.f34271f);
                pVar = new p(ne.f.B(i10, b11, b12));
                objH = pVar;
                this.f34291d = objH;
                return;
            case 2:
                q qVar = q.f34281f;
                objH = q.h(objectInput.readByte());
                this.f34291d = objH;
                return;
            case 3:
                int[] iArr = k.f34244j;
                int i11 = objectInput.readInt();
                byte b13 = objectInput.readByte();
                byte b14 = objectInput.readByte();
                j jVar = j.f34243e;
                objH = k.B(i11, b13, b14);
                this.f34291d = objH;
                return;
            case 4:
                objH = l.readExternal(objectInput);
                this.f34291d = objH;
                return;
            case 5:
                int i12 = objectInput.readInt();
                byte b15 = objectInput.readByte();
                byte b16 = objectInput.readByte();
                r rVar = r.f34286e;
                pVar = new s(ne.f.B(i12 + 1911, b15, b16));
                objH = pVar;
                this.f34291d = objH;
                return;
            case 6:
                objH = t.readExternal(objectInput);
                this.f34291d = objH;
                return;
            case 7:
                int i13 = objectInput.readInt();
                byte b17 = objectInput.readByte();
                byte b18 = objectInput.readByte();
                v vVar = v.f34292e;
                pVar = new w(ne.f.B(i13 - 543, b17, b18));
                objH = pVar;
                this.f34291d = objH;
                return;
            case 8:
                objH = x.readExternal(objectInput);
                this.f34291d = objH;
                return;
            case 9:
            case 10:
            default:
                throw new StreamCorruptedException("Unknown serialized type");
            case 11:
                ConcurrentHashMap<String, h> concurrentHashMap = h.f34241c;
                String utf = objectInput.readUTF();
                ConcurrentHashMap<String, h> concurrentHashMap2 = h.f34241c;
                if (concurrentHashMap2.isEmpty()) {
                    h.k(m.f34269e);
                    h.k(v.f34292e);
                    h.k(r.f34286e);
                    h.k(o.f34271f);
                    j jVar2 = j.f34243e;
                    h.k(jVar2);
                    concurrentHashMap2.putIfAbsent("Hijrah", jVar2);
                    h.f34242d.putIfAbsent("islamic", jVar2);
                    for (h hVar : ServiceLoader.load(h.class, h.class.getClassLoader())) {
                        h.f34241c.putIfAbsent(hVar.i(), hVar);
                        String strH = hVar.h();
                        if (strH != null) {
                            h.f34242d.putIfAbsent(strH, hVar);
                        }
                    }
                }
                h hVar2 = h.f34241c.get(utf);
                if (hVar2 == null && (hVar2 = h.f34242d.get(utf)) == null) {
                    throw new ne.a(i.f.a("Unknown chronology: ", utf));
                }
                objH = hVar2;
                this.f34291d = objH;
                return;
            case 12:
                objH = ((b) objectInput.readObject()).f((ne.h) objectInput.readObject());
                this.f34291d = objH;
                return;
            case 13:
                objH = ((c) objectInput.readObject()).f((ne.r) objectInput.readObject()).r((ne.q) objectInput.readObject());
                this.f34291d = objH;
                return;
        }
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b10 = this.f34290c;
        Object obj = this.f34291d;
        objectOutput.writeByte(b10);
        switch (b10) {
            case 1:
                p pVar = (p) obj;
                Objects.requireNonNull(pVar);
                objectOutput.writeInt(pVar.get(re.a.YEAR));
                objectOutput.writeByte(pVar.get(re.a.MONTH_OF_YEAR));
                objectOutput.writeByte(pVar.get(re.a.DAY_OF_MONTH));
                return;
            case 2:
                objectOutput.writeByte(((q) obj).f34283c);
                return;
            case 3:
                k kVar = (k) obj;
                Objects.requireNonNull(kVar);
                objectOutput.writeInt(kVar.get(re.a.YEAR));
                objectOutput.writeByte(kVar.get(re.a.MONTH_OF_YEAR));
                objectOutput.writeByte(kVar.get(re.a.DAY_OF_MONTH));
                return;
            case 4:
                ((l) obj).writeExternal(objectOutput);
                return;
            case 5:
                s sVar = (s) obj;
                Objects.requireNonNull(sVar);
                objectOutput.writeInt(sVar.get(re.a.YEAR));
                objectOutput.writeByte(sVar.get(re.a.MONTH_OF_YEAR));
                objectOutput.writeByte(sVar.get(re.a.DAY_OF_MONTH));
                return;
            case 6:
                ((t) obj).writeExternal(objectOutput);
                return;
            case 7:
                w wVar = (w) obj;
                Objects.requireNonNull(wVar);
                objectOutput.writeInt(wVar.get(re.a.YEAR));
                objectOutput.writeByte(wVar.get(re.a.MONTH_OF_YEAR));
                objectOutput.writeByte(wVar.get(re.a.DAY_OF_MONTH));
                return;
            case 8:
                ((x) obj).writeExternal(objectOutput);
                return;
            case 9:
            case 10:
            default:
                throw new InvalidClassException("Unknown serialized type");
            case 11:
                objectOutput.writeUTF(((h) obj).i());
                return;
            case 12:
                d dVar = (d) obj;
                objectOutput.writeObject(dVar.f34233c);
                objectOutput.writeObject(dVar.f34234d);
                return;
            case 13:
                g gVar = (g) obj;
                objectOutput.writeObject(gVar.f34237c);
                objectOutput.writeObject(gVar.f34238d);
                objectOutput.writeObject(gVar.f34239e);
                return;
        }
    }
}
