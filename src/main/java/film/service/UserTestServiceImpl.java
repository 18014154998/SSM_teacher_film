package film.service;

import film.mapper.UtMapper;
import film.pojo.Ut;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author:刘平远
 * @Date：2019/10/8 10:56
 * @verson 1.0
 **/
@Service("usertestService")
public class UserTestServiceImpl implements UserTestService {

    @Resource
    UtMapper utMapper;

    @Override
    public boolean registerUser(Ut ut) {
        int i=utMapper.insert(ut);
        if (i>0){
            return true;
        }else {
            return false;
        }
    }
}
