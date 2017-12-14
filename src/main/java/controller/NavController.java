package controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class NavController {
	/**
	 * 顶部导航
	 * @return
	 */
	@RequestMapping("/topNav")
	public String topNav(){
		return "topNav";
	}
	
	/**
	 * 下部导航
	 * @return
	 */
	@RequestMapping("/footerNav")
	public String footerNav(){
		return "footerNav";
	}
	
	/**
	 * 右边导航
	 * @return
	 */
	@RequestMapping("/rightNav")
	public String rightNav(){
		return "rightNav";
	}
	/**
	 * 推荐界面
	 */
	@RequestMapping("/recommand")
	public String recommand(){
		return "recommand";
		
	}
	
	/**
	 * 动态界面
	 */
	@RequestMapping("/dynamic")
	public String dynamic(){
		return "dynamic";
	}
	
	/**
	 * 遇见界面
	 */
	@RequestMapping("/meet")
	public String meet(){
		return "meet";
	}
	
	/**
	 * 寻人启事
	 */
	@RequestMapping("/accostSquare")
	public String accostSquare(){
		return "accostSquare";
	}
	
	/**
	 * 个人主页
	 */
	@RequestMapping("/personal")
	public String personal(){
		return "personal";
	}
}
