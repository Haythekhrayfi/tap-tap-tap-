package ch.qos.logback.core.net;

import ch.qos.logback.core.AppenderBase;
import ch.qos.logback.core.Layout;
import ch.qos.logback.core.boolex.EvaluationException;
import ch.qos.logback.core.boolex.EventEvaluator;
import ch.qos.logback.core.helpers.CyclicBuffer;
import ch.qos.logback.core.pattern.PatternLayoutBase;
import ch.qos.logback.core.sift.DefaultDiscriminator;
import ch.qos.logback.core.sift.Discriminator;
import ch.qos.logback.core.spi.CyclicBufferTracker;
import ch.qos.logback.core.util.ContentTypeUtil;
import ch.qos.logback.core.util.OptionHelper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

/* JADX INFO: loaded from: classes.dex */
public abstract class SMTPAppenderBase<E> extends AppenderBase<E> {
    public static InternetAddress[] EMPTY_IA_ARRAY = new InternetAddress[0];
    public static final long MAX_DELAY_BETWEEN_STATUS_MESSAGES = 1228800000;
    public CyclicBufferTracker<E> cbTracker;
    public EventEvaluator<E> eventEvaluator;
    private String from;
    public Layout<E> layout;
    public String localhost;
    public String password;
    public Session session;
    private String smtpHost;
    public Layout<E> subjectLayout;
    public String username;
    public long lastTrackerStatusPrint = 0;
    public long delayBetweenStatusMessages = 300000;
    private List<PatternLayoutBase<E>> toPatternLayoutList = new ArrayList();
    private String subjectStr = null;
    private int smtpPort = 25;
    private boolean starttls = false;
    private boolean ssl = false;
    public boolean asynchronousSending = true;
    private String charsetEncoding = "UTF-8";
    public Discriminator<E> discriminator = new DefaultDiscriminator();
    private int errorCount = 0;

    public class a implements Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CyclicBuffer<E> f3698c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final E f3699d;

        public a(CyclicBuffer<E> cyclicBuffer, E e10) {
            this.f3698c = cyclicBuffer;
            this.f3699d = e10;
        }

        @Override // java.lang.Runnable
        public void run() {
            SMTPAppenderBase.this.sendBuffer(this.f3698c, this.f3699d);
        }
    }

    private Session buildSessionFromProperties() {
        Properties properties = new Properties(OptionHelper.getSystemProperties());
        String str = this.smtpHost;
        if (str != null) {
            properties.put("mail.smtp.host", str);
        }
        properties.put("mail.smtp.port", Integer.toString(this.smtpPort));
        String str2 = this.localhost;
        if (str2 != null) {
            properties.put("mail.smtp.localhost", str2);
        }
        LoginAuthenticator loginAuthenticator = null;
        if (this.username != null) {
            loginAuthenticator = new LoginAuthenticator(this.username, this.password);
            properties.put("mail.smtp.auth", "true");
        }
        if (isSTARTTLS() && isSSL()) {
            addError("Both SSL and StartTLS cannot be enabled simultaneously");
        } else {
            if (isSTARTTLS()) {
                properties.put("mail.smtp.starttls.enable", "true");
                properties.put("mail.transport.protocol", "true");
            }
            if (isSSL()) {
                properties.put("mail.smtp.ssl.enable", "true");
            }
        }
        return Session.getInstance(properties, loginAuthenticator);
    }

    private List<InternetAddress> parseAddress(E e10) {
        int size = this.toPatternLayoutList.size();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                String strDoLayout = this.toPatternLayoutList.get(i10).doLayout(e10);
                if (strDoLayout != null && strDoLayout.length() != 0) {
                    arrayList.addAll(Arrays.asList(InternetAddress.parse(strDoLayout, true)));
                }
            } catch (AddressException e11) {
                StringBuilder sbA = defpackage.a.a("Could not parse email address for [");
                sbA.append(this.toPatternLayoutList.get(i10));
                sbA.append("] for event [");
                sbA.append(e10);
                sbA.append("]");
                addError(sbA.toString(), e11);
            }
        }
        return arrayList;
    }

    public void addTo(String str) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Null or empty <to> property");
        }
        PatternLayoutBase<E> patternLayoutBaseMakeNewToPatternLayout = makeNewToPatternLayout(str.trim());
        patternLayoutBaseMakeNewToPatternLayout.setContext(this.context);
        patternLayoutBaseMakeNewToPatternLayout.start();
        this.toPatternLayoutList.add(patternLayoutBaseMakeNewToPatternLayout);
    }

    @Override // ch.qos.logback.core.AppenderBase
    public void append(E e10) {
        if (checkEntryConditions()) {
            String discriminatingValue = this.discriminator.getDiscriminatingValue(e10);
            long jCurrentTimeMillis = System.currentTimeMillis();
            CyclicBuffer<E> orCreate = this.cbTracker.getOrCreate(discriminatingValue, jCurrentTimeMillis);
            subAppend(orCreate, e10);
            try {
                if (this.eventEvaluator.evaluate(e10)) {
                    CyclicBuffer<E> cyclicBuffer = new CyclicBuffer<>(orCreate);
                    orCreate.clear();
                    if (this.asynchronousSending) {
                        this.context.getScheduledExecutorService().execute(new a(cyclicBuffer, e10));
                    } else {
                        sendBuffer(cyclicBuffer, e10);
                    }
                }
            } catch (EvaluationException e11) {
                int i10 = this.errorCount + 1;
                this.errorCount = i10;
                if (i10 < 4) {
                    addError("SMTPAppender's EventEvaluator threw an Exception-", e11);
                }
            }
            if (eventMarksEndOfLife(e10)) {
                this.cbTracker.endOfLife(discriminatingValue);
            }
            this.cbTracker.removeStaleComponents(jCurrentTimeMillis);
            if (this.lastTrackerStatusPrint + this.delayBetweenStatusMessages < jCurrentTimeMillis) {
                StringBuilder sbA = defpackage.a.a("SMTPAppender [");
                sbA.append(this.name);
                sbA.append("] is tracking [");
                sbA.append(this.cbTracker.getComponentCount());
                sbA.append("] buffers");
                addInfo(sbA.toString());
                this.lastTrackerStatusPrint = jCurrentTimeMillis;
                long j10 = this.delayBetweenStatusMessages;
                if (j10 < MAX_DELAY_BETWEEN_STATUS_MESSAGES) {
                    this.delayBetweenStatusMessages = j10 * 4;
                }
            }
        }
    }

    public boolean checkEntryConditions() {
        StringBuilder sbA;
        String name;
        if (!this.started) {
            sbA = defpackage.a.a("Attempting to append to a non-started appender: ");
            name = getName();
        } else if (this.eventEvaluator == null) {
            sbA = defpackage.a.a("No EventEvaluator is set for appender [");
            sbA.append(this.name);
            name = "].";
        } else {
            if (this.layout != null) {
                return true;
            }
            sbA = defpackage.a.a("No layout set for appender named [");
            sbA.append(this.name);
            name = "]. For more information, please visit http://logback.qos.ch/codes.html#smtp_no_layout";
        }
        sbA.append(name);
        addError(sbA.toString());
        return false;
    }

    public abstract boolean eventMarksEndOfLife(E e10);

    public abstract void fillBuffer(CyclicBuffer<E> cyclicBuffer, StringBuffer stringBuffer);

    public InternetAddress getAddress(String str) {
        try {
            return new InternetAddress(str);
        } catch (AddressException e10) {
            addError("Could not parse address [" + str + "].", e10);
            return null;
        }
    }

    public String getCharsetEncoding() {
        return this.charsetEncoding;
    }

    public CyclicBufferTracker<E> getCyclicBufferTracker() {
        return this.cbTracker;
    }

    public Discriminator<E> getDiscriminator() {
        return this.discriminator;
    }

    public String getFrom() {
        return this.from;
    }

    public Layout<E> getLayout() {
        return this.layout;
    }

    public String getLocalhost() {
        return this.localhost;
    }

    public String getPassword() {
        return this.password;
    }

    public String getSMTPHost() {
        return getSmtpHost();
    }

    public int getSMTPPort() {
        return getSmtpPort();
    }

    public String getSmtpHost() {
        return this.smtpHost;
    }

    public int getSmtpPort() {
        return this.smtpPort;
    }

    public String getSubject() {
        return this.subjectStr;
    }

    public List<String> getToAsListOfString() {
        ArrayList arrayList = new ArrayList();
        Iterator<PatternLayoutBase<E>> it = this.toPatternLayoutList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getPattern());
        }
        return arrayList;
    }

    public List<PatternLayoutBase<E>> getToList() {
        return this.toPatternLayoutList;
    }

    public String getUsername() {
        return this.username;
    }

    public boolean isAsynchronousSending() {
        return this.asynchronousSending;
    }

    public boolean isSSL() {
        return this.ssl;
    }

    public boolean isSTARTTLS() {
        return this.starttls;
    }

    public abstract PatternLayoutBase<E> makeNewToPatternLayout(String str);

    public abstract Layout<E> makeSubjectLayout(String str);

    public void sendBuffer(CyclicBuffer<E> cyclicBuffer, E e10) {
        try {
            MimeBodyPart mimeBodyPart = new MimeBodyPart();
            StringBuffer stringBuffer = new StringBuffer();
            String fileHeader = this.layout.getFileHeader();
            if (fileHeader != null) {
                stringBuffer.append(fileHeader);
            }
            String presentationHeader = this.layout.getPresentationHeader();
            if (presentationHeader != null) {
                stringBuffer.append(presentationHeader);
            }
            fillBuffer(cyclicBuffer, stringBuffer);
            String presentationFooter = this.layout.getPresentationFooter();
            if (presentationFooter != null) {
                stringBuffer.append(presentationFooter);
            }
            String fileFooter = this.layout.getFileFooter();
            if (fileFooter != null) {
                stringBuffer.append(fileFooter);
            }
            String strDoLayout = "Undefined subject";
            Layout<E> layout = this.subjectLayout;
            if (layout != null) {
                strDoLayout = layout.doLayout(e10);
                int iIndexOf = strDoLayout != null ? strDoLayout.indexOf(10) : -1;
                if (iIndexOf > -1) {
                    strDoLayout = strDoLayout.substring(0, iIndexOf);
                }
            }
            MimeMessage mimeMessage = new MimeMessage(this.session);
            String str = this.from;
            if (str != null) {
                mimeMessage.setFrom(getAddress(str));
            } else {
                mimeMessage.setFrom();
            }
            mimeMessage.setSubject(strDoLayout, this.charsetEncoding);
            List<InternetAddress> address = parseAddress(e10);
            if (address.isEmpty()) {
                addInfo("Empty destination address. Aborting email transmission");
                return;
            }
            InternetAddress[] internetAddressArr = (InternetAddress[]) address.toArray(EMPTY_IA_ARRAY);
            mimeMessage.setRecipients(Message.RecipientType.TO, internetAddressArr);
            String contentType = this.layout.getContentType();
            if (ContentTypeUtil.isTextual(contentType)) {
                mimeBodyPart.setText(stringBuffer.toString(), this.charsetEncoding, ContentTypeUtil.getSubType(contentType));
            } else {
                mimeBodyPart.setContent(stringBuffer.toString(), this.layout.getContentType());
            }
            MimeMultipart mimeMultipart = new MimeMultipart();
            mimeMultipart.addBodyPart(mimeBodyPart);
            mimeMessage.setContent(mimeMultipart);
            updateMimeMsg(mimeMessage, cyclicBuffer, e10);
            mimeMessage.setSentDate(new Date());
            addInfo("About to send out SMTP message \"" + strDoLayout + "\" to " + Arrays.toString(internetAddressArr));
            Transport.send(mimeMessage);
        } catch (Exception e11) {
            addError("Error occurred while sending e-mail notification.", e11);
        }
    }

    public void setAsynchronousSending(boolean z10) {
        this.asynchronousSending = z10;
    }

    public void setCharsetEncoding(String str) {
        this.charsetEncoding = str;
    }

    public void setCyclicBufferTracker(CyclicBufferTracker<E> cyclicBufferTracker) {
        this.cbTracker = cyclicBufferTracker;
    }

    public void setDiscriminator(Discriminator<E> discriminator) {
        this.discriminator = discriminator;
    }

    public void setEvaluator(EventEvaluator<E> eventEvaluator) {
        this.eventEvaluator = eventEvaluator;
    }

    public void setFrom(String str) {
        this.from = str;
    }

    public void setLayout(Layout<E> layout) {
        this.layout = layout;
    }

    public void setLocalhost(String str) {
        this.localhost = str;
    }

    public void setPassword(String str) {
        this.password = str;
    }

    public void setSMTPHost(String str) {
        setSmtpHost(str);
    }

    public void setSMTPPort(int i10) {
        setSmtpPort(i10);
    }

    public void setSSL(boolean z10) {
        this.ssl = z10;
    }

    public void setSTARTTLS(boolean z10) {
        this.starttls = z10;
    }

    public void setSmtpHost(String str) {
        this.smtpHost = str;
    }

    public void setSmtpPort(int i10) {
        this.smtpPort = i10;
    }

    public void setSubject(String str) {
        this.subjectStr = str;
    }

    public void setUsername(String str) {
        this.username = str;
    }

    @Override // ch.qos.logback.core.AppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        if (this.cbTracker == null) {
            this.cbTracker = new CyclicBufferTracker<>();
        }
        Session sessionBuildSessionFromProperties = buildSessionFromProperties();
        this.session = sessionBuildSessionFromProperties;
        if (sessionBuildSessionFromProperties == null) {
            addError("Failed to obtain javax.mail.Session. Cannot start.");
        } else {
            this.subjectLayout = makeSubjectLayout(this.subjectStr);
            this.started = true;
        }
    }

    @Override // ch.qos.logback.core.AppenderBase, ch.qos.logback.core.spi.LifeCycle
    public synchronized void stop() {
        this.started = false;
    }

    public abstract void subAppend(CyclicBuffer<E> cyclicBuffer, E e10);

    public void updateMimeMsg(MimeMessage mimeMessage, CyclicBuffer<E> cyclicBuffer, E e10) {
    }
}
