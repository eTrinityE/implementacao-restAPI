package com.etrinitye.implementacaorestapi.models;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "emails")
public class Email {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "from_table", nullable = false, length = 100)
    private String from;
    @Column(name = "to_table", nullable = false, length = 100)
    private String to;
    @Column(nullable = false, length = 100)
    private String subject;
    @Column(nullable = false, length = 100)
    private String body;
    @Column(nullable = false, length = 100)
    private String attachment;

    public Email(Long id, String from, String to, String subject, String body, String attachment) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.subject = subject;
        this.body = body;
        this.attachment = attachment;
    }

    public Email() {
    }

    @Override
    public String toString() {
        return "Email{" +
                "id=" + id +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", subject='" + subject + '\'' +
                ", body='" + body + '\'' +
                ", attachment='" + attachment + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Email email = (Email) o;

        if (!Objects.equals(id, email.id)) return false;
        if (!Objects.equals(from, email.from)) return false;
        if (!Objects.equals(to, email.to)) return false;
        if (!Objects.equals(subject, email.subject)) return false;
        if (!Objects.equals(body, email.body)) return false;
        return Objects.equals(attachment, email.attachment);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (from != null ? from.hashCode() : 0);
        result = 31 * result + (to != null ? to.hashCode() : 0);
        result = 31 * result + (subject != null ? subject.hashCode() : 0);
        result = 31 * result + (body != null ? body.hashCode() : 0);
        result = 31 * result + (attachment != null ? attachment.hashCode() : 0);
        return result;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAttachment() {
        return attachment;
    }

    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }
}
