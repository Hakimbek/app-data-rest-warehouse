package uz.pdp.appdatarestwarehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appdatarestwarehouse.entity.Attachment;

@Projection(name = "attachmentProjection", types = Attachment.class)
public interface AttachmentProjection {
    Integer getId();

    String getName();

    String getSize();

    String getContentType();
}
