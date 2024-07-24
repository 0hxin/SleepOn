package bitc.fullstack.sleepon.dto.intro;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="body")
public class IntroDataBodyDTO {
    private int numOfRows; // 한페이지 결과수
    private int pageNo; // 페이지 번호
    private int totalCount; // 전체 결과수
    private IntroDataItemsDTO items;

    public int getNumOfRows() {
        return numOfRows;
    }

    public void setNumOfRows(int numOfRows) {
        this.numOfRows = numOfRows;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    @XmlElement(name="items")
    public IntroDataItemsDTO getItems() {
        return items;
    }

    public void setItems(IntroDataItemsDTO items) {
        this.items = items;
    }
}
