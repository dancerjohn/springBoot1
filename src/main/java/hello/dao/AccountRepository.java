package hello.dao;

import javax.annotation.Nullable;

import org.springframework.data.repository.PagingAndSortingRepository;

import hello.domain.Account;


public interface AccountRepository extends PagingAndSortingRepository<Account, String> {
	
	@Nullable
	Account findByUsername(String name);
}
