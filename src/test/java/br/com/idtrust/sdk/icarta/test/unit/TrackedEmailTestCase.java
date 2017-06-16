package br.com.idtrust.sdk.icarta.test.unit;

import org.junit.Assert;
import org.junit.Test;

import br.com.idtrust.sdk.icarta.model.RecipientType;
import br.com.idtrust.sdk.icarta.model.TrackedEmail;

public class TrackedEmailTestCase {

    @Test
    public void shouldCreateSimpleTrackedEmail() {
        final TrackedEmail trackedEmail = new TrackedEmail()
                .from("test@company.com").to("test@company2.com")
                .withSubject("Subject").withMessage("Hello");
        Assert.assertNotNull(trackedEmail.getFrom());
        Assert.assertTrue(trackedEmail.getRecipients().stream()
                .filter(r -> r.getType().equals(RecipientType.TO))
                .count() == 1);
        Assert.assertNotNull(trackedEmail.getSubject());
        Assert.assertNotNull(trackedEmail.getMessage());
    }

    @Test
    public void shouldCreateSimpleTrackedEmailWithName() {
        final TrackedEmail trackedEmail = new TrackedEmail()
                .from("test@company.com").to("test@company2.com")
                .withSubject("Subject").withMessage("Hello");
        Assert.assertNotNull(trackedEmail.getFrom());
        Assert.assertTrue(trackedEmail.getRecipients().stream()
                .filter(r -> r.getType().equals(RecipientType.TO))
                .count() == 1);
        Assert.assertTrue(trackedEmail.getRecipients().stream()
                .filter(r -> r.getType().equals(RecipientType.TO)
                        && r.getEmailAddress().getName().equals("test@company2.com"))
                .findFirst().isPresent());
        Assert.assertNotNull(trackedEmail.getSubject());
        Assert.assertNotNull(trackedEmail.getMessage());
    }

    @Test
    public void shouldCreateTrackedEmailWithCC() {
        final TrackedEmail trackedEmail = new TrackedEmail()
                .from("test@company.com").to("test@company2.com")
                .withCC("test@company3.com").withSubject("Subject")
                .withMessage("Hello");
        Assert.assertNotNull(trackedEmail.getFrom());
        Assert.assertTrue(trackedEmail.getRecipients().stream()
                .filter(r -> r.getType().equals(RecipientType.TO))
                .count() == 1);
        Assert.assertTrue(trackedEmail.getRecipients().stream()
                .filter(r -> r.getType().equals(RecipientType.CC))
                .count() == 1);
        Assert.assertNotNull(trackedEmail.getSubject());
        Assert.assertNotNull(trackedEmail.getMessage());
    }

    @Test
    public void shouldCreateTrackedEmailWithCCWithName() {
        final TrackedEmail trackedEmail = new TrackedEmail()
                .from("test@company.com").to("test@company2.com")
                .withCC("test@company3.com").withSubject("Subject")
                .withMessage("Hello");
        Assert.assertNotNull(trackedEmail.getFrom());
        Assert.assertTrue(trackedEmail.getRecipients().stream()
                .filter(r -> r.getType().equals(RecipientType.TO))
                .count() == 1);
        Assert.assertTrue(trackedEmail.getRecipients().stream()
                .filter(r -> r.getType().equals(RecipientType.CC))
                .count() == 1);
        Assert.assertTrue(trackedEmail.getRecipients().stream()
                .filter(r -> r.getType().equals(RecipientType.CC)
                        && r.getEmailAddress().getName().equals("test@company3.com"))
                .findFirst().isPresent());
        Assert.assertNotNull(trackedEmail.getSubject());
        Assert.assertNotNull(trackedEmail.getMessage());
    }

    @Test
    public void shouldCreateTrackedEmailWithBCC() {
        final TrackedEmail trackedEmail = new TrackedEmail()
                .from("test@company.com").to("test@company2.com")
                .withBCC("test@company3.com").withSubject("Subject")
                .withMessage("Hello");
        Assert.assertNotNull(trackedEmail.getFrom());
        Assert.assertTrue(trackedEmail.getRecipients().stream()
                .filter(r -> r.getType().equals(RecipientType.TO))
                .count() == 1);
        Assert.assertTrue(trackedEmail.getRecipients().stream()
                .filter(r -> r.getType().equals(RecipientType.BCC))
                .count() == 1);
        Assert.assertNotNull(trackedEmail.getSubject());
        Assert.assertNotNull(trackedEmail.getMessage());
    }

    @Test
    public void shouldCreateTrackedEmailWithBCCWithName() {
        final TrackedEmail trackedEmail = new TrackedEmail()
                .from("test@company.com").to("test@company2.com")
                .withBCC("test@company3.com").withSubject("Subject")
                .withMessage("Hello");
        Assert.assertNotNull(trackedEmail.getFrom());
        Assert.assertTrue(trackedEmail.getRecipients().stream()
                .filter(r -> r.getType().equals(RecipientType.TO))
                .count() == 1);
        Assert.assertTrue(trackedEmail.getRecipients().stream()
                .filter(r -> r.getType().equals(RecipientType.BCC))
                .count() == 1);
        Assert.assertTrue(trackedEmail.getRecipients().stream()
                .filter(r -> r.getType().equals(RecipientType.BCC)
                        && r.getEmailAddress().getName().equals("test@company3.com"))
                .findFirst().isPresent());
        Assert.assertNotNull(trackedEmail.getSubject());
        Assert.assertNotNull(trackedEmail.getMessage());
    }

    @Test
    public void shouldCreateTrackedEmailWithAttachment() {
        final TrackedEmail trackedEmail = new TrackedEmail()
                .from("test@company.com").to("test@company2.com")
                .withSubject("Subject").withMessage("Hello")
                .withAttachment("file.txt", "text/plain", "dummy".getBytes());
        Assert.assertNotNull(trackedEmail.getFrom());
        Assert.assertTrue(trackedEmail.getRecipients().stream()
                .filter(r -> r.getType().equals(RecipientType.TO))
                .count() == 1);
        Assert.assertTrue(trackedEmail.getAttachments().size() == 1);
        Assert.assertNotNull(trackedEmail.getSubject());
        Assert.assertNotNull(trackedEmail.getMessage());
    }
    
    @Test(expected=RuntimeException.class)
    public void shouldNotSendInvalidEmailFrom() {
        final TrackedEmail trackedEmail = new TrackedEmail()
                .from("testcompany.com").to("test@company2.com")
                .withSubject("Subject").withMessage("Hello");
        Assert.assertNotNull(trackedEmail.getFrom());
        Assert.assertTrue(trackedEmail.getRecipients().stream()
                .filter(r -> r.getType().equals(RecipientType.TO))
                .count() == 1);
        Assert.assertNotNull(trackedEmail.getSubject());
        Assert.assertNotNull(trackedEmail.getMessage());
    }
    
    @Test(expected=RuntimeException.class)
    public void shouldNotSendInvalidEmailRecipient() {
        final TrackedEmail trackedEmail = new TrackedEmail()
                .from("test@company.com").to("test@company2")
                .withSubject("Subject").withMessage("Hello");
        Assert.assertNotNull(trackedEmail.getFrom());
        Assert.assertTrue(trackedEmail.getRecipients().stream()
                .filter(r -> r.getType().equals(RecipientType.TO))
                .count() == 1);
        Assert.assertNotNull(trackedEmail.getSubject());
        Assert.assertNotNull(trackedEmail.getMessage());
    }


}
