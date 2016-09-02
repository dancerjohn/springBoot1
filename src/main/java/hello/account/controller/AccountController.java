package hello.account.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.base.Strings;
import com.google.common.collect.Lists;

import hello.dao.AccountRepository;
import hello.domain.Account;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/bookmarks")
@Slf4j
public class AccountController {

	@Autowired
	public AccountRepository accountRepo;

    @RequestMapping("/all")
    public Iterable<Account> getAccounts(
    		@RequestParam(value="name", required=false) String name) {
    	log.info("getting data for {}", name);
    	if (Strings.isNullOrEmpty(name))
            return accountRepo.findAll();
    	else
    		return Lists.newArrayList(	accountRepo.findByUsername(name));
    	
    }
}
