package uz.pdp.appdatarestwarehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appdatarestwarehouse.entity.Attachment;
import uz.pdp.appdatarestwarehouse.entity.AttachmentContent;

@Projection(name = "attachmentContentProjection", types = AttachmentContent.class)
public interface AttachmentContentProjection {
    Integer getId();

    String getName();

    byte[] getBytes();

    Attachment getAttachment();
}
