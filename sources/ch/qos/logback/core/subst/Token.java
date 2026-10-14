package ch.qos.logback.core.subst;

import android.support.v4.media.c;
import ch.qos.logback.core.CoreConstants;
import defpackage.a;

/* JADX INFO: loaded from: classes.dex */
public class Token {
    public String payload;
    public Type type;
    public static final Token START_TOKEN = new Token(Type.START, null);
    public static final Token CURLY_LEFT_TOKEN = new Token(Type.CURLY_LEFT, null);
    public static final Token CURLY_RIGHT_TOKEN = new Token(Type.CURLY_RIGHT, null);
    public static final Token DEFAULT_SEP_TOKEN = new Token(Type.DEFAULT, null);

    public enum Type {
        LITERAL,
        START,
        CURLY_LEFT,
        CURLY_RIGHT,
        DEFAULT
    }

    public Token(Type type, String str) {
        this.type = type;
        this.payload = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Token token = (Token) obj;
        if (this.type != token.type) {
            return false;
        }
        String str = this.payload;
        String str2 = token.payload;
        return str == null ? str2 == null : str.equals(str2);
    }

    public int hashCode() {
        Type type = this.type;
        int iHashCode = (type != null ? type.hashCode() : 0) * 31;
        String str = this.payload;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbA = a.a("Token{type=");
        sbA.append(this.type);
        String string = sbA.toString();
        if (this.payload != null) {
            string = s.a.a(c.a(string, ", payload='"), this.payload, CoreConstants.SINGLE_QUOTE_CHAR);
        }
        return string + '}';
    }
}
