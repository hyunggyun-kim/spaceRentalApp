package space;

import pattern.SpaceComponent;

/**
 * [Decorator Pattern]
 * 부가 서비스를 추가하기 위한 추상 데코레이터 클래스
 */
public abstract class AddonDecorator implements SpaceComponent {
    protected SpaceComponent wrappee;

    public AddonDecorator(SpaceComponent spaceComponent) {
        this.wrappee = spaceComponent;
    }

    @Override
    public String getDescription() {
        return wrappee.getDescription();
    }

    @Override
    public int getCost() {
        return wrappee.getCost();
    }
}
