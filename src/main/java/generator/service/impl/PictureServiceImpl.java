package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.caillo.caillopicturebackend.model.entity.Picture;
import generator.service.PictureService;
import com.caillo.caillopicturebackend.mapper.PictureMapper;
import org.springframework.stereotype.Service;

/**
* @author Zhan
* @description 针对表【picture(图片)】的数据库操作Service实现
* @createDate 2025-06-22 23:15:54
*/
@Service
public class PictureServiceImpl extends ServiceImpl<PictureMapper, Picture>
    implements PictureService{

}




