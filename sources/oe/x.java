package oe;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public enum x implements i {
    BEFORE_BE,
    BE;

    public static x of(int i10) {
        if (i10 == 0) {
            return BEFORE_BE;
        }
        if (i10 == 1) {
            return BE;
        }
        throw new ne.a("Era is not valid for ThaiBuddhistEra");
    }

    public static x readExternal(DataInput dataInput) throws IOException {
        return of(dataInput.readByte());
    }

    private Object writeReplace() {
        return new u((byte) 8, this);
    }

    @Override // re.f
    public re.d adjustInto(re.d dVar) {
        return dVar.p(re.a.ERA, getValue());
    }

    @Override // re.e
    public int get(re.i iVar) {
        return iVar == re.a.ERA ? getValue() : range(iVar).a(getLong(iVar), iVar);
    }

    public String getDisplayName(pe.l lVar, Locale locale) {
        pe.b bVar = new pe.b();
        bVar.f(re.a.ERA, lVar);
        return bVar.m(locale).a(this);
    }

    @Override // re.e
    public long getLong(re.i iVar) {
        if (iVar == re.a.ERA) {
            return getValue();
        }
        if (iVar instanceof re.a) {
            throw new re.m(ne.b.a("Unsupported field: ", iVar));
        }
        return iVar.getFrom(this);
    }

    public int getValue() {
        return ordinal();
    }

    @Override // re.e
    public boolean isSupported(re.i iVar) {
        if (iVar instanceof re.a) {
            return iVar == re.a.ERA;
        }
        return iVar != null && iVar.isSupportedBy(this);
    }

    @Override // re.e
    public <R> R query(re.k<R> kVar) {
        if (kVar == re.j.f35375c) {
            return (R) re.b.ERAS;
        }
        if (kVar == re.j.f35374b || kVar == re.j.f35376d || kVar == re.j.f35373a || kVar == re.j.f35377e || kVar == re.j.f35378f || kVar == re.j.f35379g) {
            return null;
        }
        return kVar.a(this);
    }

    @Override // re.e
    public re.n range(re.i iVar) {
        if (iVar == re.a.ERA) {
            return iVar.range();
        }
        if (iVar instanceof re.a) {
            throw new re.m(ne.b.a("Unsupported field: ", iVar));
        }
        return iVar.rangeRefinedBy(this);
    }

    public void writeExternal(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(getValue());
    }
}
