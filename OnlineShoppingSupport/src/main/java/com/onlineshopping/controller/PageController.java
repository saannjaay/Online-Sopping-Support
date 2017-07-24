/**
 * 
 */
package com.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author sannj
 *
 */

@Controller
public class PageController {

	@RequestMapping(value = { "/", "/home", "/index" })

	public ModelAndView index() {

		ModelAndView mv = new ModelAndView("page");
		mv.addObject("gretting", "welcome to spring mvc");

		return mv;

/*	}

	// query String concept required=false no need to set value
	@RequestMapping(value = "/test")
	public ModelAndView test(@RequestParam(value = "gretting", required = false) String gretting) {

		if (gretting == null) {
			// if greating value not set by default

			gretting = "JAY MATA RANI";
		}

		ModelAndView mv = new ModelAndView("page");
		mv.addObject("gretting", gretting);

		return mv;
	}

	// use of path variable
	@RequestMapping(value = "/test1/{gretting}")
	public ModelAndView test1(@PathVariable(value = "gretting", required = false) String gretting) {

		if (gretting == null) {
			// if greating value not set by default

			gretting = "JAY MATA RANI";
		}

		ModelAndView mv = new ModelAndView("page");
		mv.addObject("gretting", gretting);

		return mv;
	}
*/
}
}
